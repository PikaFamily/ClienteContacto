package com.potecialcustomers.PC.client;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
    @Autowired
    ClientService clientService;

    @GetMapping("/getAll")
    public ArrayList<ClientModel> getAll() {
        return clientService.getAll();
    }

    @PostMapping("/saveClient")
    public boolean saveClient(@RequestBody ClientModel clientModel) {
        return clientService.clientSave(clientModel);
    }

    @PostMapping("/deleteClient/{idClient}")
    public boolean saveClient(@PathVariable int idClient) {
        return clientService.clientDeleteID(idClient);
    }

    @GetMapping("/findById/{idClient}")
    public ClientModel findById(@PathVariable int idClient) {
        return clientService.findById(idClient);
    }
}
