/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.web.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;


/**
 *
 * @author apple
 */
@Configuration
public class ScheduleConfiguration {
    private static int value=1;
    @Scheduled(cron = "0 * * * * ?")
    public void test(){
        System.out.println("this is test run interval " + value);
        value++;
    }
}
