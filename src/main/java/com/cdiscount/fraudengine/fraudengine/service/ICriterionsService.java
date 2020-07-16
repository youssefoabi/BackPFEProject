package com.cdiscount.fraudengine.fraudengine.service;

import com.cdiscount.fraudengine.fraudengine.model.request.CreateCriterionRequest;
import com.cdiscount.fraudengine.fraudengine.model.response.CreateCriterionResponse;


import java.util.List;
import java.util.Optional;

public interface ICriterionsService {
    CreateCriterionResponse createCriterion(CreateCriterionRequest request);

    List<CreateCriterionRequest> getAllCriterions();

    Optional<CreateCriterionRequest> getCriterionsById(String id);
}
