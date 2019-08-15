/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.web.controller;


import com.cibt.web.entity.Contact;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author apple
 */
@Controller
@RequestMapping(value = "/contact")
public class ContactController {
    @GetMapping
    public String index(){
        return "contact/index";
    }
    
    
    @PostMapping
    @ResponseBody
    public String save(@ModelAttribute(value = "Contact")Contact contact){
        String data="<h1>Your Details</h1>";
        data += "<br/>name:" + contact.getName();
        data += "</br>Email:" + contact.getEmail();
        data += "</br>Subject:" + contact.getSubject();
        data += "</br>Message:" + contact.getBody();
        return data;
        
    }
}
