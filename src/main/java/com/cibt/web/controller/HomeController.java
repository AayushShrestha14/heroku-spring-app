/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 *
 * @author apple
 */

@Controller
@RequestMapping(value = {"/"})
public class HomeController{

    @GetMapping
    public String index(Model model){
        model.addAttribute("name", "Creators Institute");
        model.addAttribute("courses", 
                new String[]{"Java","Python","PHP","ASP.net"});
                
        return "home/index";
    }
   
}
