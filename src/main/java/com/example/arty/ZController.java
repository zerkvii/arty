package com.example.arty;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller

public class ZController {


    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String getIndex(Model model) {
        model.addAttribute("userform",new UserForm());
        model.addAttribute("registerform",new RegisterForm());
        System.out.println("ok");
        return "login/index";
    }

    @RequestMapping(value = "/getLogin",method = RequestMethod.POST)
    public String checkUser(UserForm user){
        System.out.println(user.getUsername()+" "+user.getPassword());
            return "login/home";
    }

    @RequestMapping(value = "/getRegister",method = RequestMethod.POST)
    public String postUser( RegisterForm register){
        System.out.println(register.getCellphone());
        if(register.getTerms())System.out.println("true");
        return "login/home";
    }
}
