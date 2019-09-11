package com.example.unittest.Configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Value("${app.title}")
    private String devconfig;

    @GetMapping("/show_profiles")
    public String show_env() {

        System.out.println(" ==== environment is ==== " + devconfig);
        return  devconfig;

    }

}
