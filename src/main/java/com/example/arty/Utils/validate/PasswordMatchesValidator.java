package com.example.arty.Utils.validate;

import com.example.arty.Utils.Form.RegisterForm;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by Keno&Kemo on 21.10.2017..
 */
public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, Object> {

    @Override
    public void initialize(PasswordMatches passwordMatches) {
    }
    @Override
    public boolean isValid(Object obj, ConstraintValidatorContext context){
        RegisterForm registerForm = (RegisterForm) obj;
        return registerForm.getPassword().equals(registerForm.getPwd_cfm());
    }

}