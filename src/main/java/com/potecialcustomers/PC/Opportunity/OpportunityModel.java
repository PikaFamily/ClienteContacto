package com.potecialcustomers.PC.Opportunity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="opportunitymodel")
public class OpportunityModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable=false)
    private int idOpportunity;
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
