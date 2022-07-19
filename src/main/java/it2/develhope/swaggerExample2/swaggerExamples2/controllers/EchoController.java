package it2.develhope.swaggerExample2.swaggerExamples2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/echo")
public class EchoController {

    @GetMapping(value = "")
    public String sayEcho(){
        return "Hello, this is an echo get";
    }
}
