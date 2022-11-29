package com.potecialcustomers.PC.Client;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.potecialcustomers.PC.client.ClientModel;
import com.potecialcustomers.PC.client.ClientRepository;
import com.potecialcustomers.PC.client.ClientService;

public class ClientServiceTest {

    static ClientService clientService;
    static ClientRepository clientRepository;

    /* Empieza creando un nuevo servicio */
    @BeforeAll
    public static void setup() {
    	clientRepository = new FakeClientRepository();
    }

    /* Reinicia el valor del servicio */
    
    @BeforeEach
    public void init() {
    	clientService = new ClientService(clientRepository);
    }

    /**
     * 1# Add Client
     * 
     */
    @ParameterizedTest
    @MethodSource("clientGenerator")
    void addOpportunity(ClientModel client) {
        boolean correctlySaved = clientRepository.clientSave(client);

        assertTrue(correctlySaved);
    }
	
    /* Base de Datos */
    private static Stream<Arguments> clientGenerator() {
        return Stream.of(
                Arguments.of(new ClientModel(0, "David", "Parejo")),
                Arguments.of(new ClientModel(1, "Mara", "Maqueda")));

    }
}
