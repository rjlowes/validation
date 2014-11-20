package com.boot.domain;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

// http://stackoverflow.com/questions/12146298/spring-mvc-how-to-perform-validation

public class AddressValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Address.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Address address = (Address) target;
        
        if (address.getStreet() == null)  {
            errors.rejectValue("street", "Street cannot be null");
        }
        
        int len = address.getStreet().length();
        
        if (len == 0) {
            errors.rejectValue("street", "Street length must be bigger than 0");
        }
    }

}
