package com.example.arty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ZController {

    private final UserRepository userRepository;
    private final UserServiceImp userService;

    @Autowired
    public ZController(UserRepository userRepository, UserServiceImp userService) {
        this.userRepository = userRepository;
        this.userService = userService;
    }

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
    public String postUser(RegisterForm register, HttpServletRequest request){
        System.out.println(register.getCellphone());
        String ipadr=request.getRemoteAddr();
        System.out.println(ipadr);
        if(register.getTerms())System.out.println("true");
        userService.createUserAccount(register,ipadr);
        return "login/home";
    }
}
