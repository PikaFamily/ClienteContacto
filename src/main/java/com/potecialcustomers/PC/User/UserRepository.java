package com.potecialcustomers.PC.User;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Integer> {

    public Optional<UserModel> findById(int idUser);

    public ArrayList<UserModel> findAll();

    public void deleteById(int idOpportunity);

    @Query(value = "SELECT usermodel FROM usermodel WHERE username LIKE %?1%", nativeQuery = true)
    public UserModel findByName(String username);

    @Query(value = "Select usermodel.username usermodel.password FROM bank WHERE username LIKE %?1% AND password LIKE %?2%", nativeQuery = true)
    public void checkUser(String username, String password);
}