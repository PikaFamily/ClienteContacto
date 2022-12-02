package com.potecialcustomers.PC.Opportunity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Opportunity Model Table
 * This class is the model to create the table in the database,
 * in it we will be able to reflect the different fields with the desired
 * parameters.
 */
@Entity
@Table(name = "opportunitymodel")
public class OpportunityModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer idOpportunity;
    private String client;
    private String description;

    public OpportunityModel(int idOpportunity, String client, String description) {
        this.idOpportunity = idOpportunity;
        this.client = client;
        this.description = description;
    }

    public OpportunityModel() {
    }

    public Integer getIdOpportunity() {
        return idOpportunity;
    }

    public void setIdOpportunity(Integer idOpportunity) {
        this.idOpportunity = idOpportunity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

}
