package com.potecialcustomers.PC.Opportunity;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class OpportunityServiceTest {

    static OpportunityService opportunityService;

    /* Empieza creando un nuevo servicio */
    @BeforeAll
    public static void setup() {
        opportunityService = new OpportunityService();
    }

    /**
     * 1# Add Opportunity
     * 
     */
    @ParameterizedTest
    @MethodSource("opportunityGenerator")
    void addOpportunity(OpportunityModel opportunity) {
        boolean correctlySaved = opportunityService.opportunitySave(opportunity);

        assertTrue(correctlySaved);
    }

    /*
     * 2# Not add Opportunity
     */
    @ParameterizedTest
    @MethodSource("opportunityGenerator")
    void notAddOpportunity(OpportunityModel notOpportunity) {
        boolean notCorrectlySaved = opportunityService.opportunitySave(notOpportunity);

        assertFalse(notCorrectlySaved);
    }

    /* Base de Datos */
    private static Stream<Arguments> opportunityGenerator() {
        return Stream.of(
                Arguments.of(new OpportunityModel(0, "cliente0", "potencial")),
                Arguments.of(new OpportunityModel(1, "cliente1", "potencial")));

    }
}
