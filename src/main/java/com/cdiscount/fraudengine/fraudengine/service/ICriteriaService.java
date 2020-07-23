package com.cdiscount.fraudengine.fraudengine.service;

import com.cdiscount.fraudengine.fraudengine.model.request.CreateCriterionRequest;
import com.cdiscount.fraudengine.fraudengine.model.request.CreateRuleRequest;
import com.cdiscount.fraudengine.fraudengine.model.response.CreateCriterionResponse;
import com.cdiscount.fraudengine.fraudengine.model.response.CreateRuleResponse;


import java.util.List;
import java.util.Optional;

public interface ICriteriaService {

    CreateCriterionResponse createCriterion(CreateCriterionRequest request);

    List<CreateCriterionRequest> getAllCriteria();

    Optional<CreateCriterionRequest> getCriterionById(String id);

    String deleteCriterionById(String id);

    CreateCriterionResponse updateCriterion(CreateCriterionRequest request);


}
