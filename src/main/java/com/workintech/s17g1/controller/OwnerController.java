package com.workintech.s17g1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/workintech/owner")
public class OwnerController {

    @Value("${project.owner}")
    private String owner;

    @Value("${project.developer}")
    private String developer;

    @Value("${project.type}")
    private String type;

    @GetMapping
    public String getOwnerInfo(){
        return new StringBuilder("Owner: ").append(owner).append(" Developer: ").append(developer).append(" Type: ").append(type).toString();
    }
}
