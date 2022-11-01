package com.bs.hellogitflow.controller;

import com.bs.hellogitflow.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HomeController {
    private final HelloService helloService;
    @GetMapping("/")
    public String home(){
        return "home 1";
    }

    @GetMapping("/hello")
    public String sayHello(){
        return helloService.sayHello("park");
    }
}
