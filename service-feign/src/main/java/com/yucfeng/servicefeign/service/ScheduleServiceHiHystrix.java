package com.yucfeng.servicefeign.service;

import org.springframework.stereotype.Component;

@Component
public class ScheduleServiceHiHystrix implements ScheduleServiceHi {


    @Override
    public String sayHiFromClientOne(String name) {
        return "Sorry " + name;
    }
}
