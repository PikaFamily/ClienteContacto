package com.potecialcustomers.PC;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.test.context.SpringBootTest;

import com.potecialcustomers.PC.Opportunity.OpportunityModel;

@SpringBootTest
class PotencialCustomersApplicationTests {

	/**
	 * 1# Add Oportunity
	 * 
	 */
	@ParameterizedTest
	@ValueSource()
	void addOpportunity(OpportunityModel opportunity) {

	}

}
