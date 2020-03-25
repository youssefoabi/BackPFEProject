package com.cdiscount.fraudengine.fraudengine.model.response;

import com.cdiscount.fraudengine.fraudengine.model.request.CreateRuleRequest;

public class CreateRuleResponse {

    private CreateRuleRequest response;

    public CreateRuleResponse(CreateRuleRequest response) {
        this.response = response;
    }

    public CreateRuleRequest getResponse() {
        return response;
    }

    public void setResponse(CreateRuleRequest response) {
        this.response = response;
    }
}
