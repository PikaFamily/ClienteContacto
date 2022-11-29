package com.potecialcustomers.PC.client;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface ClientRepository extends JpaRepository<ClientModel, Integer>{
	
    public boolean clientSave(ClientModel client);
    
    public  ClientModel findId(int idClient);
    
    public ArrayList<ClientModel> findAll();
    
    public boolean deleteId(int idClient);
    
    @Query("SELECT clientmodel FROM bank WHERE name LIKE %?1%")
    public ClientModel findName(String name);
}
