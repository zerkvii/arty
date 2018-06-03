package com.example.arty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findUserByEmail(String email) {
        return userRepository.findUserByEmail(email);
    }

    @Override
    public void createUserAccount(RegisterForm registerForm,String ipadr) {
        final Utils ut=new Utils();
        final User user=new User();
        user.setUsername(registerForm.getUsername());
        user.setCellphone(registerForm.getEmail());
        user.setEmail(registerForm.getEmail());
        user.setPassword(registerForm.getPassword());
        user.setRegister_date(ut.getCurrentTime());
        user.setRegister_ip(ipadr);
        userRepository.save(user);
    }
}
