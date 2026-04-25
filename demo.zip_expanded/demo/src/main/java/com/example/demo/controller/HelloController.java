package com.example.demo.controller;

import org.springframework.aot.hint.annotation.RegisterReflectionForBinding;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping(method = RequestMethod.GET,path = "/hello")
	//@GetMapping("/hello")
	public String greet() {
		return "HEllo";
	}
}
