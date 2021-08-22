package com.example.oauth2.resourceserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/samples")
    public String[] getSample() {
        return new String[] { "Sample 1", "Sample 2", "Sample 3" };
    }

}
