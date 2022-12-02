package com.potecialcustomers.PC.contact;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller Class Contact
 * With the controller class you can choose all the contact api's for our
 * frontend
 */
@RestController
@RequestMapping("/api/contact")
public class ContactController {
    @Autowired
    ContactService contactService;

    @GetMapping("/getAll")
    public ArrayList<ContactModel> getAll() {
        return contactService.getAll();
    }

    @PostMapping("/saveContact")
    public boolean saveClient(@RequestBody ContactModel contactModel) {
        return contactService.contactSave(contactModel);
    }

    @PostMapping("/deleteContact/{idContact}")
    public boolean saveContact(@PathVariable int idContact) {
        return contactService.contactDeleteID(idContact);
    }

    @GetMapping("/findById/{idContact}")
    public ContactModel findById(@PathVariable int idContact) {
        return contactService.findById(idContact);
    }
}
