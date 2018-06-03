package com.example.arty;

public interface UserService {
    User findUserByEmail(String email);

    void createUserAccount(RegisterForm registerForm,String ipadr);
}
