package com.helloworld.controller;
import java.io.ByteArrayInputStream;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldController 
{
@RequestMapping("/")
public String hello() 
{

    ByteArrayInputStream s = new ByteArrayInputStream("testinput".getBytes());
    System.out.println(s);

    return "<h1> Congratulations. You have successfully deployed the sample Spring Boot Application. </h1>";
}
}
