package com.cdiscount.fraudengine.fraudengine.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "simulation")
public class CriterionOperatorValue {
    private String criterionID;
    private String operatorId;
    private Date creationDate;
    private String value;


    public String getCriterionID() {
        return criterionID;
    }

    public void setCriterionID(String criterionID) {
        this.criterionID = criterionID;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
