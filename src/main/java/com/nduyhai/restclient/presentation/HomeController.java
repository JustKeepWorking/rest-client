package com.nduyhai.restclient.presentation;

import com.nduyhai.restclient.infrastructure.RestProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HomeController {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private RestProperties properties;

    @GetMapping("/")
    public String getHome() {
        final ResponseEntity<String> res =  this.restTemplate.getForEntity(this.properties.getUrl(), String.class,"No variable");
        return res.getBody();
    }

}
