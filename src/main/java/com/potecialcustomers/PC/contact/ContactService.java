package com.potecialcustomers.PC.contact;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.potecialcustomers.PC.Opportunity.OpportunityModel;
import com.potecialcustomers.PC.Opportunity.OpportunityRepository;
import com.potecialcustomers.PC.client.ClientRepository;

@Service
public class ContactService {

	@Autowired
	ContactRepository contactRepo;
	@Autowired
	OpportunityRepository opportunityRepo;
	@Autowired
	ClientRepository clientRepo;

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

	public boolean contactNotClientSaveOpportunity(OpportunityModel opportunityModel) {
		if (clientRepo.findById(1).isPresent()) {
			return false;
		} else if (opportunityRepo.findById(1).isPresent()) {

		} else {
			opportunityRepo.save(opportunityModel = new OpportunityModel(1, "client", "potencialCliente"));
			return true;
		}
		return false;
	}
}
