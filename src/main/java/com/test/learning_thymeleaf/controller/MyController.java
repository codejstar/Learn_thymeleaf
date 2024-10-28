package com.test.learning_thymeleaf.controller;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String about(Model model) {

        model.addAttribute("name", "Jagdeep Jakhu");
        model.addAttribute("Date", new Date().toString());
        return "about";
    }

    // Handling Iteration
    @GetMapping("/example-loop")
    public String iterateHandler(Model m) {

        // create a list
        List<String> names = List.of("Ankit", "Raman", "Hardik", "Ravi");

        // sent list
        m.addAttribute("names", names);

        return "iterate";
    }

    // handler for conditional statements
    @GetMapping("/condition")
    public String conditionHandler(Model m) {
        return "condition";
    }
}
