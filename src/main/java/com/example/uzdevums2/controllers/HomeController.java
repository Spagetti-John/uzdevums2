package com.example.uzdevums2.controllers;

import com.example.uzdevums2.Uzdevums2Application;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("time", System.nanoTime());
        model.addAttribute("unik", Uzdevums2Application.TIME);
        return "index";
    }
}
