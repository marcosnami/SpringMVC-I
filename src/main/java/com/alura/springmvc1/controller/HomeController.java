package com.alura.springmvc1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by MarcosNami on 7/15/2017.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String index() {
        System.out.println("Entrando na home do CDC");
        return "home";
    }
}
