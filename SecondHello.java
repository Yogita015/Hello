package com.javaguides.springboot_first_app;

import org.springframework.web.bind.annotation.GetMapping;

public class SecondHello {

    @GetMapping("/SecondHello")
    public String SecondHello(){
        return "Welcome to my second page";
    }
}
