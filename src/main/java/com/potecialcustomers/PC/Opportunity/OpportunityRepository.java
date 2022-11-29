package com.potecialcustomers.PC.Opportunity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OpportunityRepository extends JpaRepository<OpportunityModel, Integer>{

    public boolean opportunitySave(OpportunityModel opportunity);
}
