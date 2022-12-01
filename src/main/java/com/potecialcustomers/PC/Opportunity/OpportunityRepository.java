package com.potecialcustomers.PC.Opportunity;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface OpportunityRepository extends JpaRepository<OpportunityModel, Integer> {
    public Optional<OpportunityModel> findById(int idOpportunity);

    public ArrayList<OpportunityModel> findAll();

    public void deleteById(int idOpportunity);

    @Query(value = "SELECT clientmodel FROM bank WHERE name LIKE %?1%", nativeQuery = true)
    public OpportunityModel findByName(String client);
}
