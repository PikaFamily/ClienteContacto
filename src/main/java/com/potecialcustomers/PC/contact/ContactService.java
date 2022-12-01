package com.potecialcustomers.PC.contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.potecialcustomers.PC.client.ClientRepository;

@Service
public class ContactService {

	@Autowired
	ContactRepository contactRepo;

	public ContactService(ContactRepository fakeContactRepository) {
		this.contactRepo = fakeContactRepository;
	}
}
