package com.valmiki.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ValmikiGithubCicdActionsApplication {


    public static void main(String[] args) {
        SpringApplication.run(ValmikiGithubCicdActionsApplication.class, args);
    }

    @GetMapping("/get")
    public String getMessage(){
        return "Welcome to our website !!!!";
    }
}
