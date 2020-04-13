package com.cdiscount.fraudengine.fraudengine.service.impl;

import com.cdiscount.fraudengine.fraudengine.model.request.CreateRuleRequest;
import com.cdiscount.fraudengine.fraudengine.model.response.CreateRuleResponse;
import com.cdiscount.fraudengine.fraudengine.repository.IRulesRepository;
import com.cdiscount.fraudengine.fraudengine.service.IRulesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

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
