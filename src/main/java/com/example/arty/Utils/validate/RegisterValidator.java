package com.example.arty.Utils.validate;

import com.example.arty.Utils.Form.RegisterForm;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;


public class RegisterValidator implements Validator {
    @Override
    public boolean supports(final Class<?> clazz) {
        return RegisterForm.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(final Object obj,final Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "message.username", "username is required.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "message.email", "email is required.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "cellphone", "message.cellphone", "cellphone is required.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "message.password", "password is required.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password_cfm", "message.password_cfm", "password_cfm is required.");

    }
}
