package com.example.arty.Utils.validate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CellphoneValidator implements ConstraintValidator<ValidCellphone, String> {

    private static final String CELLPHONE_PATTERN = "^\\+?[0-9. ()-]{10,25}$";

    @Override
    public void initialize(ValidCellphone constraintAnnotation) {

    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return (validateCellphone(s));
    }


    private boolean validateCellphone(String cellphone) {
        Pattern pattern = Pattern.compile(CELLPHONE_PATTERN);
        Matcher matcher = pattern.matcher(cellphone);
        return matcher.matches();
    }
}
