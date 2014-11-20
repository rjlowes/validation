package com.boot.controller;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.boot.domain.Address;
import com.boot.domain.AddressValidator;
import com.boot.domain.Person;

// http://stackoverflow.com/questions/12146298/spring-mvc-how-to-perform-validation

@RestController
@RequestMapping("/person")
public class PersonController {
    
    @RequestMapping(value = "/one", method = RequestMethod.POST)
    public Person one(
            @RequestParam("name") String name, 
            @RequestParam("age") Long age, 
            @Valid Person person,
            BindingResult result) {
        
        if (result.hasErrors()) {
            return null;
        }
        
        return person;
    }
    
    @RequestMapping(value = "/two", method = RequestMethod.POST)
    public Person two(
            @Valid @RequestBody Person person,
            BindingResult result) {
        
        if (result.hasErrors()) {
            return null;
        }
        
        return person;
    }
    
    @RequestMapping(value = "/three/name/{name}/age/{age}", method = RequestMethod.POST)
    public Person three(
            @PathVariable("name") String name,
            @PathVariable("age") int age,
            @Valid Person person,
            BindingResult result) {
     
        if (result.hasErrors()) {
            return null;
        }
        
        return person;
    }
    
    @InitBinder("address")
    protected void initBinder(WebDataBinder binder) {
        binder.setValidator(new AddressValidator());
    }
    
    @RequestMapping(value = "/four", method = RequestMethod.POST)
    public Address four(
            @RequestParam("street") String street,
            @Valid Address address,
            BindingResult result) {
        
        if (result.hasErrors()) {
            return null;
        }
        
        return address;
    }
}
