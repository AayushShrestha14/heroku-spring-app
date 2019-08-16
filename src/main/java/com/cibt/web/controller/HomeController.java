/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 *
 * @author apple
 */

@Controller
@RequestMapping(value = {"/"})
public class HomeController{

    @Autowired
    private JavaMailSender mailSender;
    
    @GetMapping
    public String index(Model model){
        model.addAttribute("name", "Creators Institute");
        model.addAttribute("courses", 
                new String[]{"Java","Python","PHP","ASP.net"});
                
        return "home/index";
    }
    
    @GetMapping(value = "mail")
    @ResponseBody
    public String mail(){
        SimpleMailMessage message=new SimpleMailMessage();
        message.setFrom("lfaimap@gmail.com");
        message.setTo("dixanta@gmail.com");
        message.setSubject("mail aayo ta ?");
        message.setText("mail aako ho");
       
        mailSender.send(message);
        return "mail gayo hai";
    }
   
}
