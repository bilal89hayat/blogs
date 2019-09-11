package com.example.unittest.Controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Value("${app.title}")   //this annotation will pull app.title value from corresponding properties file.
    private String config;

    @GetMapping("/show_profiles")
    public String show_env() {

        System.out.println(" ==== environment is ==== " + config);
        return  config;

    }

}
