package com.springprojectsts;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/display")
    public String display() {
        return "My first Spring Apllication";
    }
    
    @PostMapping("/mes")
    public String message() {
        return "Message Application";
    }

}
