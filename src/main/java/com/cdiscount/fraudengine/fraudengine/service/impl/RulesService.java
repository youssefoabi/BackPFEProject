package com.cdiscount.fraudengine.fraudengine.service.impl;

import com.cdiscount.fraudengine.fraudengine.model.CriterionOperatorValue;
import com.cdiscount.fraudengine.fraudengine.model.Simulation;
import com.cdiscount.fraudengine.fraudengine.model.request.CreateRuleRequest;
import com.cdiscount.fraudengine.fraudengine.model.response.CreateRuleResponse;
import com.cdiscount.fraudengine.fraudengine.repository.IRulesRepository;
import com.cdiscount.fraudengine.fraudengine.service.IRulesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@Component
public class RulesService implements IRulesService {

    @Autowired
    private IRulesRepository rulesRepository;




    @Override
    public CreateRuleResponse createRule(CreateRuleRequest request) {
        return new CreateRuleResponse(rulesRepository.save(request));
    }

    @Override
    public CreateRuleResponse updateRule(CreateRuleRequest request) {
        CreateRuleRequest ruleInDB = rulesRepository.findById(request.getId()).get();

        ruleInDB.setName(request.getName());
        ruleInDB.setCreationDate(request.getCreationDate());
        ruleInDB.setPriority(request.getPriority());
        ruleInDB.setReferentID(request.getReferentID());
        ruleInDB.setDescription(request.getDescription());
        ruleInDB.setValidatedBy(request.getValidatedBy());
        ruleInDB.setEditedBy(request.getEditedBy());
        ruleInDB.setComment(request.getComment());
        ruleInDB.setValidated(request.isValidated());
        ruleInDB.setActivated(request.isActivated());
        ruleInDB.setVersion(request.getVersion());
        ruleInDB.setEditedAction(request.getEditedAction());
        ruleInDB.setCriterionOperatorValues(request.getCriterionOperatorValues());
        ruleInDB.setSimulations(request.getSimulations());



        return new CreateRuleResponse(rulesRepository.save(ruleInDB));
    }

    @Override
    public List<CreateRuleRequest> getAllRules() {
        return rulesRepository.findAll();
    }

    @Override
    public Optional<CreateRuleRequest> getRulesById(String id){
        return  rulesRepository.findById(id);
    }

    @Override
    public String deleteRulesById(String id) {
        rulesRepository.deleteById(id);
        return "Success";
    }




}
