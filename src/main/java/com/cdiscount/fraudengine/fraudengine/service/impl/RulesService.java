package com.cdiscount.fraudengine.fraudengine.service.impl;

import com.cdiscount.fraudengine.fraudengine.model.CriteriaValue;
import com.cdiscount.fraudengine.fraudengine.model.Simulation;
import com.cdiscount.fraudengine.fraudengine.model.request.CreateRuleRequest;
import com.cdiscount.fraudengine.fraudengine.model.response.CreateRuleResponse;
import com.cdiscount.fraudengine.fraudengine.repository.IRulesRepository;
import com.cdiscount.fraudengine.fraudengine.service.IRulesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
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
        ruleInDB.setDescription(request.getDescription());
        ruleInDB.setValidated(request.isValidated());
        ruleInDB.setActivated(request.isActivated());
        ruleInDB.setPriority(request.getPriority());
        ruleInDB.setValidatedBy(request.getValidatedBy());
        ruleInDB.setEditedBy(request.getEditedBy());
        ruleInDB.setComment(request.getComment());
        ruleInDB.setVersion(request.getVersion());
        ruleInDB.setEditedAction(request.getEditedAction());
        ruleInDB.setCriteriaValues(request.getCriteriaValues());
        ruleInDB.setSimulations(request.getSimulations());
        ruleInDB.setCreatedAt(request.getCreatedAt());
        ruleInDB.setModifiedAt(request.getModifiedAt());

        return new CreateRuleResponse(rulesRepository.save(ruleInDB));
    }

    @Override
    public List<CreateRuleRequest> getAllRules() {
        return rulesRepository.findAll();
    }

    @Override
    public Optional<CreateRuleRequest> getRuleById(String id){
        return  rulesRepository.findById(id);
    }

    @Override
    public String deleteRuleById(String id) {
        rulesRepository.deleteById(id);
        return "Success";
    }
}
