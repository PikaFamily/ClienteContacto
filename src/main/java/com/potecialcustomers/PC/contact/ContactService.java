package com.potecialcustomers.PC.contact;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

	@Autowired
	ContactRepository contactRepo;

	public boolean contactSave(ContactModel contactModel) {
		if (contactRepo.save(contactModel) != null) {
			return true;
		}
		return false;
	}

	public boolean contactDeleteID(int idContact) {
		contactRepo.deleteById(idContact);
		return false;
	}

	public ArrayList<ContactModel> getAll() {

		return contactRepo.findAll();
	}

	public ContactModel findById(int idContact) {
		Optional<ContactModel> opt = contactRepo.findById(idContact);
		if (opt.isPresent()) {
			return opt.get();
		}
		return null;
	}
}
