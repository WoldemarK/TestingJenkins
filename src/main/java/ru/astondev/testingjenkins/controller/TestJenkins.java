package ru.astondev.testingjenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestJenkins {

    @GetMapping("/test1")
    public String show1() {
        return "TEST1";
    }
    @GetMapping("/test2")
    public String show2() {
        return "TEST2";
    }
}
