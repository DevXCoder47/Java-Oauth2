package com.nikijv.javaoauth2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

@GetMapping("/home")
public String home() {
    return "Hello home";
}

@GetMapping("/home/secured")
public String secured() {
    return "Hello secured";
}
}
