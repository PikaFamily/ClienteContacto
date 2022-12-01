package com.potecialcustomers.PC.client;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
	@Autowired
	ClientRepository clientRepo;

	public boolean clientSave(ClientModel client) {
		if (clientRepo.save(client) != null) {
			return true;
		}
		return false;
	}

	public boolean clientDeleteID(int idClient) {
		clientRepo.deleteById(idClient);
		return false;
	}

	public ArrayList<ClientModel> getAll() {

		return clientRepo.findAll();
	}

	public ClientModel findById(int idClient) {
		Optional<ClientModel> opt = clientRepo.findById(idClient);
		if (opt.isPresent()) {
			return opt.get();
		}
		return null;
	}

}
