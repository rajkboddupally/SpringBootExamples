package com.springboot.examples.SpringBootExamples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("main")
public class MyController {

    @Autowired
    private Environment env;

    @Autowired
    private GlobalProperties gl;

    @GetMapping("/hello")
    public String email() {
        //return env.getProperty("email");
        return String.valueOf(gl.getThreadPoolSize());
    }
}
