package edu.miu.cs489.dentalsurgerysystemweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/adsweb")
public class MainController {

    @GetMapping
    public String hello() {
        return "Hello from Dental Surgery System Server APIs";
    }
}
