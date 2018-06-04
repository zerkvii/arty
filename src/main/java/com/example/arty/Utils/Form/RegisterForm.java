package com.example.arty.Utils.Form;


import com.example.arty.Utils.validate.ValidEmail;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class RegisterForm {

    @NotBlank(message = "用户名非空")
    private String username;
    @ValidEmail(message = "邮箱需要合法")
    private String email;


    private String cellphone;
    private String password;
    private String pwd_cfm;

}
