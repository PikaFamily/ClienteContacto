package com.potecialcustomers.PC.Client;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.potecialcustomers.PC.client.ClientModel;
import com.potecialcustomers.PC.client.ClientRepository;
import com.potecialcustomers.PC.client.ClientService;

public class ClientServiceTest {

	static ClientService clientService;

	/* Empieza creando un nuevo servicio */
	@BeforeAll
	public static void setup() {
		clientService = new ClientService();
	}

	/**
	 * 1# Add Client
	 * 
	 */
	@ParameterizedTest
	@MethodSource("clientGenerator")
	void saveClient(ClientModel correctClient) {
		boolean correctlySaved = clientService.clientSave(correctClient);

		assertTrue(correctlySaved);
	}

	/**
	 * 2# Delete Client
	 * 
	 */
	@ParameterizedTest
	@MethodSource("clientIdGenerator")
	void deleteClient(int correctClientId) {
		boolean correctlyDeleted = clientService.clientDeleteID(correctClientId);
		assertTrue(correctlyDeleted);
	}

	/**
	 * 3# Not Delete Client
	 * 
	 */
	@ParameterizedTest
	@MethodSource("clientIdGenerator")
	void notDeleteClient(int falseClientId) {
		boolean notCorrectlyDeleted = clientService.clientDeleteID(falseClientId);
		assertFalse(notCorrectlyDeleted);
	}

	/*
	 * 4# Not Add Client
	 */
	@ParameterizedTest
	@MethodSource("clientGenerator")
	void notSaveClient(ClientModel notCorrectClient) {
		boolean notCorrectlySaved = clientService.clientSave(notCorrectClient);
		assertFalse(notCorrectlySaved);
	}

	/* Base de Datos */
	private static Stream<Arguments> clientGenerator() {
		return Stream.of(
				Arguments.of(new ClientModel(0, "David", "Parejo"), new ClientModel(1, "Mara", "Maqueda")));

	}

	/* Base de Datos */
	private static Stream<Arguments> clientIdGenerator() {
		return Stream.of(
				Arguments.of(1, 2));

	}
}
