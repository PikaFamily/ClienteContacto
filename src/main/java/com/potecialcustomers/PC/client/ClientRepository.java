package com.potecialcustomers.PC.client;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<ClientModel, Integer> {

    public Optional<ClientModel> findById(int idClient);

    public ArrayList<ClientModel> findAll();

    public void deleteById(int idClient);

    @Query(value = "SELECT * FROM clientemodel WHERE name LIKE ?1", nativeQuery = true)
    public ClientModel findByName(String name);

}
