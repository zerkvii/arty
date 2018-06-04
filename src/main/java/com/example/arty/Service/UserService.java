package com.example.arty.Service;

import com.example.arty.Entity.User;
import com.example.arty.Utils.Form.RegisterForm;


public interface UserService {
    User findUserByEmail(String email);

    void createUserAccount(RegisterForm registerForm, String ipadr);


}
