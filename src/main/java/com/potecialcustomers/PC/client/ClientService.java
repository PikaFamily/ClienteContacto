package com.potecialcustomers.PC.client;

import org.springframework.stereotype.Service;

@Service
public class ClientService {
	ClientRepository clientRepo;
	
    public ClientService(ClientRepository fakeClientRepository) {
    }
	public boolean clientSave(ClientModel client) {

		return false;
	}
	
	public boolean clientDeleteID(int idClient) {

		return false;
	}


}
