package com.potecialcustomers.PC.Opportunity;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OpportunityService {
    @Autowired
    OpportunityRepository opportunityRepo;

    public boolean opportunitySave(OpportunityModel opportunityModel) {
        return false;
    }

    public boolean opportunityDeleteID(int idOpportunity) {
        opportunityRepo.deleteById(idOpportunity);
        return false;
    }

    public ArrayList<OpportunityModel> getAll() {

        return opportunityRepo.findAll();
    }

    public OpportunityModel findById(int idOpportunity) {
        Optional<OpportunityModel> opt = opportunityRepo.findById(idOpportunity);
        if (opt.isPresent()) {
            return opt.get();
        }
        return null;
    }

}
