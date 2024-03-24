package com.mafzii.auth.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")
public class DemoController {
    /*
    *   This is a demo class
    *   All endpoints that are secure will be different from the whitelist declared in SecurityConfig
    *   To hit this api you must have authentication
    * */
    @GetMapping
    public ResponseEntity<String> demo() {
        return ResponseEntity.ok("authentication is valid!!!");
    }
}
