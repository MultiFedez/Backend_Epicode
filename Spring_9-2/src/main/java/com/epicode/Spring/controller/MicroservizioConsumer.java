package com.epicode.Spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MicroservizioConsumer {
	@GetMapping("/abc")
	public String test() {
		return "Testo di prova!!";
	}

}
