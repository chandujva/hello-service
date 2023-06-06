package com.hello.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("svc/hello")
public class HelloWorldController {

	@GetMapping("/get/{helloWorld}")
	public static String helloWorld(@PathVariable String helloWorld) {
		return "welcome to sts -- " + helloWorld;
	}
	
}
