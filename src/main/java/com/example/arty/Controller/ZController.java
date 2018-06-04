package com.example.arty.Controller;

import com.example.arty.DAO.UserRepository;
import com.example.arty.Service.UserServiceImp;
import com.example.arty.Utils.Form.RegisterForm;
import com.example.arty.Utils.Form.UserForm;
import org.springframework.beans.factory.annotation.Autowired;
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
        return "login/arty";
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
        userService.createUserAccount(register,ipadr);
        return "login/home";
    }
}
