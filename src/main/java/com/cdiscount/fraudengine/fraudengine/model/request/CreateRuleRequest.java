package com.cdiscount.fraudengine.fraudengine.model.request;

import com.cdiscount.fraudengine.fraudengine.model.Simulation;
import com.cdiscount.fraudengine.fraudengine.model.CriterionOperatorValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection = "frauderules")
public class CreateRuleRequest {
    @Id
    private String id;
    private String name;
    private Date creationDate;
    private int priority;
    private String referentID;
    private String description;
    private String validatedBy;
    private String editedBy;
    private String comment;
    private boolean isActivated;



    private int version;
    private boolean isValidated;
    private String editedAction;
    private List<CriterionOperatorValue> criterionOperatorValues;
    private List<Simulation> simulations;

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

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getReferentID() {
        return referentID;
    }

    public void setReferentID(String referentID) {
        this.referentID = referentID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    @JsonProperty(value="isActivated")
    public boolean isActivated() {
        return isActivated;
    }

    public void setActivated(boolean activated) {
        isActivated = activated;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @JsonProperty(value="isValidated")
    public boolean isValidated() {
        return isValidated;
    }

    public void setValidated(boolean validated) {
        isValidated = validated;
    }

    public String getEditedAction() {
        return editedAction;
    }

    public void setEditedAction(String editedAction) {
        this.editedAction = editedAction;
    }

    public List<CriterionOperatorValue> getCriterionOperatorValues() {
        return criterionOperatorValues;
    }

    public void setCriterionOperatorValues(List<CriterionOperatorValue> criterionOperatorValues) {
        this.criterionOperatorValues = criterionOperatorValues;
    }

    public List<Simulation> getSimulations() {
        return simulations;
    }

    public void setSimulations(List<Simulation> simulations) {
        this.simulations = simulations;
    }





}
