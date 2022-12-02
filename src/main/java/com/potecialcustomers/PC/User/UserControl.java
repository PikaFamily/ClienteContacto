package com.potecialcustomers.PC.User;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller Class User
 * With the controller class you can choose all the User api's for our frontend
 */
@RestController
@RequestMapping("/api/users")
public class UserControl {
    @Autowired
    UserService userService;

    @GetMapping("/getAllUser")
    public ArrayList<UserModel> getAll() {
        return userService.getAll();
    }

    @PostMapping("/saveUser")
    public boolean saveClient(@RequestBody UserModel userModel) {
        return userService.userSave(userModel);
    }

    @PostMapping("/deleteUser/{idUser}")
    public boolean deleteUser(@PathVariable int idUser) {
        return userService.userDeleteID(idUser);
    }

    @GetMapping("/findByIdUser/{idUser}")
    public UserModel findById(@PathVariable int idUser) {
        return userService.findById(idUser);
    }

    @PostMapping("/checkUser")
    public boolean checkUser(@RequestBody UserModel user) {
        return userService.checkUser(user);
    }

}
