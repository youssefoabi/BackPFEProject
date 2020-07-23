package com.cdiscount.fraudengine.fraudengine.model.request;

import com.cdiscount.fraudengine.fraudengine.model.Simulation;
import com.cdiscount.fraudengine.fraudengine.model.CriteriaValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

@Document(collection = "rules")
public class CreateRuleRequest {
    @Id
    private String id;
    private String name;
    private String description;
    private boolean isActivated;
    private boolean isValidated;
    private int priority;
    private String validatedBy;
    private String editedBy;
    private String comment;
    private int version;
    private String editedAction;
    private List<CriteriaValue> CriteriaValues;
    private List<Simulation> simulations;
    private Date createdAt;
    private Date modifiedAt;

    @JsonProperty(value="isActivated")
    public boolean isActivated() {
        return isActivated;
    }

    @JsonProperty(value="isValidated")
    public boolean isValidated() {
        return isValidated;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setActivated(boolean activated) {
        isActivated = activated;
    }

    public void setValidated(boolean validated) {
        isValidated = validated;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getValidatedBy() {
        return validatedBy;
    }

    public void setValidatedBy(String validatedBy) {
        this.validatedBy = validatedBy;
    }

    public String getEditedBy() {
        return editedBy;
    }

    public void setEditedBy(String editedBy) {
        this.editedBy = editedBy;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getEditedAction() {
        return editedAction;
    }

    public void setEditedAction(String editedAction) {
        this.editedAction = editedAction;
    }

    public List<CriteriaValue> getCriteriaValues() {
        return CriteriaValues;
    }

    public void setCriteriaValues(List<CriteriaValue> criteriaValues) {
        CriteriaValues = criteriaValues;
    }

    public List<Simulation> getSimulations() {
        return simulations;
    }

    public void setSimulations(List<Simulation> simulations) {
        this.simulations = simulations;
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
