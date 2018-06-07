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
import javax.validation.Valid;

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
    public String getIndex(Model model,String info) {
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
    public String postUser( final RegisterForm register, HttpServletRequest request){
        System.out.println(register.getCellphone());
        String ipadr=request.getRemoteAddr();
        System.out.println(ipadr);
        if(userService.isExist(register.getUsername(),register.getEmail(),register.getEmail())) {
            userService.createUserAccount(register, ipadr);
            String info="error";
            Model model = null;
            return getIndex(model,info);
        }else return
    }
}
