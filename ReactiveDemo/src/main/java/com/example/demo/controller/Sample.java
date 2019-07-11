package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sample {

	@GetMapping("/test")
	public String test(@RequestParam("key") String key){
		return key;
	}
}
