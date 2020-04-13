package com.cdiscount.fraudengine.fraudengine.model.response;

import com.cdiscount.fraudengine.fraudengine.model.request.CreateCriterionRequest;
import com.cdiscount.fraudengine.fraudengine.model.request.CreateRuleRequest;

public class CreateCriterionResponse {
    private CreateCriterionRequest response;

    public CreateCriterionResponse(CreateCriterionRequest response) {
        this.response = response;
    }

    public CreateCriterionRequest getResponse() {
        return response;
    }

    public void setResponse(CreateCriterionRequest response) {
        this.response = response;
    }
}
