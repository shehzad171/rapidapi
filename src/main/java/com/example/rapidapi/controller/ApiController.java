package com.example.rapidapi.controller;


import com.example.rapidapi.configure.RapidApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    private final RapidApiService rapidApiService;

    @Autowired
    public ApiController(RapidApiService rapidApiService) {
        this.rapidApiService = rapidApiService;
    }

    // Rest of your controller code here
    @GetMapping("/{query}")
    public String getAlluArjunImages(@PathVariable String query) {
        return rapidApiService.makeRapidApiRequest(query);
    }
}
