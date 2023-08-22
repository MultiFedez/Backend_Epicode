package com.epicode.Spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/be")
public class MicroservizioProducer {
	@GetMapping("/txt")
	public String testTxt() {
		return "BE String Content";
	}

}
 