package com.abc.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/get")      //Handler Mapping
	public String helloWorld() {
		return " Hello welcome to eureka";
	}
}
