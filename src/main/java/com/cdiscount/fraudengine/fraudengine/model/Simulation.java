package com.cdiscount.fraudengine.fraudengine.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "criterionOperatorValue")
public class Simulation {

    private int totalImapact;
    private int totalRessources;
    private Date creationDate;


    public int getTotalImapact() {
        return totalImapact;
    }

    public void setTotalImapact(int totalImapact) {
        this.totalImapact = totalImapact;
    }

    public int getTotalRessources() {
        return totalRessources;
    }

    public void setTotalRessources(int totalRessources) {
        this.totalRessources = totalRessources;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
