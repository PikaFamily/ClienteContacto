package com.potecialcustomers.PC.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepo;

    public boolean opportunitySave(UserModel userModel) {
        if (userRepo.save(userModel) != null) {
            return true;
        }
        return false;
    }

    public boolean checkUser(String username, String password) {
        return false;
    }
}
