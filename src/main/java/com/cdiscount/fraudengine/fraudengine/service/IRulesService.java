package com.cdiscount.fraudengine.fraudengine.service;

import com.cdiscount.fraudengine.fraudengine.model.request.CreateRuleRequest;
import com.cdiscount.fraudengine.fraudengine.model.response.CreateRuleResponse;

import java.util.List;
import java.util.Optional;

public interface IRulesService {
    CreateRuleResponse createRule(CreateRuleRequest request);

    List<CreateRuleRequest> getAllRules();

    Optional<CreateRuleRequest> getRulesById(String id);

    String deleteRulesById(String id);

    CreateRuleResponse updateRule(CreateRuleRequest request);
}
