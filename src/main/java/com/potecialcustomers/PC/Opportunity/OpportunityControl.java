package com.potecialcustomers.PC.Opportunity;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/opportunity")
public class OpportunityControl {
    @Autowired
    OpportunityService opportunityService;

    @GetMapping("/getAllOpportunity")
    public ArrayList<OpportunityModel> getAll() {
        return opportunityService.getAll();
    }

    @PostMapping("/saveOpportunity")
    public boolean saveClient(@RequestBody OpportunityModel opportunityModel) {
        return opportunityService.opportunitySave(opportunityModel);
    }

    @PostMapping("/deleteOpportunity/{idOpportunity}")
    public boolean deleteOpportunity(@PathVariable int idOpportunity) {
        return opportunityService.opportunityDeleteID(idOpportunity);
    }

    @GetMapping("/findByIdOpportunity/{idOpportunity}")
    public OpportunityModel findById(@PathVariable int idOpportunity) {
        return opportunityService.findById(idOpportunity);
    }
}
