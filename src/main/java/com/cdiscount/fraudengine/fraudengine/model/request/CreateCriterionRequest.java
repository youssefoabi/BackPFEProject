package com.cdiscount.fraudengine.fraudengine.model.request;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection = "criterions")
public class CreateCriterionRequest {
    @Id
    private String id;
    private String code;
    private String name;
    private Date creationDate;
    private String explanation;
    private List<String> eligibleOperators;


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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
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
}
