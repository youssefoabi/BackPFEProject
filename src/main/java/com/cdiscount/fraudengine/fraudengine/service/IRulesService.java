package com.cdiscount.fraudengine.fraudengine.service;

import com.cdiscount.fraudengine.fraudengine.model.request.CreateRuleRequest;
import com.cdiscount.fraudengine.fraudengine.model.response.CreateRuleResponse;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

public interface IRulesService {
    CreateRuleResponse createRule(CreateRuleRequest request);

    List<CreateRuleRequest> getAllRules();

    Optional<CreateRuleRequest> getRuleById(String id);

    String deleteRuleById(String id);

    CreateRuleResponse updateRule(CreateRuleRequest request);
}
