package com.example.deployment;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {
    @GetMapping(value = "/") //http:localhost:8000/
    public String home(Model model) {
        return "index";
    }

}
