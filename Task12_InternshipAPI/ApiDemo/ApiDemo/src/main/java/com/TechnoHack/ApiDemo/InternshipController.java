package com.TechnoHack.ApiDemo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InternshipController {
    
    @GetMapping("/")
public String index() {
    return "Entry point of the page";
}

    @GetMapping("/home")
    public String home() {
        return "Welcome to TechnoHacks Internship API";
    }

    @GetMapping("/about")
    public String about() {
        return "This API is built using Java and Spring Boot.";
    }

    @GetMapping("/team")
    public String team() {
        return "Team: Mohammed Aasif";
    }

    @GetMapping("/contact")
    public String contact() {
        return "Contact us at support@technohacks.com";
    }

    @GetMapping("/login")
    public String login() {
        return "Login endpoint is ready.";
    }
}