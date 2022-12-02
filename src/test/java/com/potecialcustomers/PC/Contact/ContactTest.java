package com.potecialcustomers.PC.Contact;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.potecialcustomers.PC.contact.ContactModel;
import com.potecialcustomers.PC.contact.ContactService;

public class ContactTest {

    static ContactService contactService;

    /* Empieza creando un nuevo servicio */
    @BeforeAll
    public static void setup() {
        contactService = new ContactService();
    }

    /**
     * 1# Add Opportuniy if the contact are not client
     * 
     */
    @ParameterizedTest
    @MethodSource("contactGenerator")
    void addOpportunityIfContactIsNotClient() {
        boolean correctlySaved = contactService.contactNotClientSaveOpportunity(null);

        assertTrue(correctlySaved);
    }

    /* Base de Datos */

    private static Stream<Arguments> contactGenerator() {
        return Stream.of(
                Arguments.of(new ContactModel(1, "email", null, null, null, 1, (Integer) null)),
                Arguments.of(new ContactModel(1, "email", null, null, null, (Integer) null, (Integer) null)));

    }
}
