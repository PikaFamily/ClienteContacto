package com.potecialcustomers.PC.User;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.potecialcustomers.Security.SecurityPassword;

@Service
public class UserService {
    @Autowired
    UserRepository userRepo;

    SecurityPassword securityPass;

    public boolean userSave(UserModel userModel) {
        if (userRepo.findByName(userModel.getUsername()).isEmpty()) {
            userRepo.save(userModel);
            return true;
        }
        return false;
    }

    public boolean checkUser(UserModel user) {
        Optional<UserModel> opt = userRepo.findByName(user.getUsername());
        if (opt.isPresent()) {
            securityPass = new SecurityPassword();
            String passwordSecurity = securityPass.hashing(user.getPassword());
            String confirmPasswordSecurity = opt.get().getPassword();
            if (user.getUsername().equals("root") && passwordSecurity.equals(confirmPasswordSecurity)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<UserModel> getAll() {

        return userRepo.findAll();
    }

    public UserModel findById(int idUser) {
        Optional<UserModel> opt = userRepo.findById(idUser);
        if (opt.isPresent()) {
            return opt.get();
        }
        return null;
    }

    public boolean userDeleteID(int idUser) {
        userRepo.deleteById(idUser);
        return false;
    }
}
