package com.cdiscount.fraudengine.fraudengine.model.request;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection = "criteria")
public class CreateCriterionRequest {
    @Id
    private String id;
    private String code;
    private String explanation;
    private List<String> eligibleOperators;
    private Date createdAt;
    private Date modifiedAt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public List<String> getEligibleOperators() {
        return eligibleOperators;
    }

    public void setEligibleOperators(List<String> eligibleOperators) {
        this.eligibleOperators = eligibleOperators;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }
}
