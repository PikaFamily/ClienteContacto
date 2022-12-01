package com.potecialcustomers.PC.Opportunity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "opportunitymodel")
public class OpportunityModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer idOpportunity;
    private String client;

    public OpportunityModel(int idOpportunity, String client) {
        this.idOpportunity = idOpportunity;
        this.client = client;
    }

    public int getIdOpportunity() {
        return idOpportunity;
    }

    public String getClient() {
        return client;
    }

    public void setIdOpportunity(int idOpportunity) {
        this.idOpportunity = idOpportunity;
    }

    public void setClient(String client) {
        this.client = client;
    }

}
