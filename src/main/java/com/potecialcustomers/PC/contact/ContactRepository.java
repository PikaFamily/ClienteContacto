package com.potecialcustomers.PC.contact;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<ContactModel, Integer> {
    public Optional<ContactModel> findById(int idContact);

    public ArrayList<ContactModel> findAll();

    public void deleteById(int idContact);

    @Query(value = "SELECT * FROM contactmodel WHERE name LIKE ?1", nativeQuery = true)
    public ContactModel findByName(String client);

}
