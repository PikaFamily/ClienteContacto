package com.potecialcustomers.PC.Opportunity;

public class FakeOpportunityRepository implements OpportunityRepository {

    @Override
    public boolean opportunitySave(OpportunityModel opportunity) {
		return false;
    }

}
