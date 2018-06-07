package com.example.arty.Utils.Form;


import com.example.arty.Utils.validate.ValidEmail;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class RegisterForm {
    @NotNull
    @NotEmpty(message = "输入用户名")
    private String username;
    @ValidEmail(message = "邮箱需要合法")
    private String email;

    private String cellphone;
    private String password;
    private String pwd_cfm;

}
