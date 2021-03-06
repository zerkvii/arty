package com.example.arty.Service;

import com.example.arty.DAO.UserRepository;
import com.example.arty.Entity.User;
import com.example.arty.Utils.Form.RegisterForm;
import com.example.arty.Utils.Utils;
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
    public User findUserByName(String name) {
        return userRepository.findUserByUsername(name);
    }

    @Override
    public User findUserByCellphone(String cellphone) {
        return userRepository.findUserByCellphone(cellphone);
    }
    public boolean isExist(String username,String email,String cellphone){
        return this.findUserByName(username) != null && this.findUserByEmail(email) != null && this.findUserByCellphone(cellphone) != null;
    }

    @Override
    public void createUserAccount(RegisterForm registerForm, String ipadr) {
        final Utils ut=new Utils();
        final User user=new User();
        user.setUsername(registerForm.getUsername());
        user.setCellphone(registerForm.getCellphone());
        user.setEmail(registerForm.getEmail());
        user.setPassword(registerForm.getPassword());
        user.setRegister_date(ut.getCurrentTime());
        user.setRegister_ip(ipadr);
        user.setLast_ip(ipadr);
        userRepository.save(user);
    }


}
