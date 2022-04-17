package ru.rubik.matlabweb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.rubik.matlabweb.services.Lab4Service;

import java.io.IOException;

@CrossOrigin("*")
@RestController
@RequestMapping("/lab4")
public class Lab4Controller {
    @Autowired
    private Lab4Service lab4Service;

    @PostMapping("/process")
    public String init() throws IOException, InterruptedException {
        lab4Service.initLab();
        return "ok";
    }
}
