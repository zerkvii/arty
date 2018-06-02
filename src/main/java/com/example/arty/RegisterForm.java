package com.example.arty;


import lombok.Data;

@Data
class RegisterForm {
    private String username;
    private String email;
    private String cellphone;
    private String password;
    private String pwd_cfm;
    private Boolean terms;

}
