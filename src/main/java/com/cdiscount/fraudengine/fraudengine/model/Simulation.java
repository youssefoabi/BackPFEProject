package com.cdiscount.fraudengine.fraudengine.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "simulations")
public class Simulation {

    private int totalImpact;
    private int totalRessources;

    public int getTotalImpact() {
        return totalImpact;
    }

    public void setTotalImpact(int totalImpact) {
        this.totalImpact = totalImpact;
    }

    public int getTotalRessources() {
        return totalRessources;
    }

    public void setTotalRessources(int totalRessources) {
        this.totalRessources = totalRessources;
    }
}
