package com.epicode.pagina_personale.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class pageController {

	@GetMapping("/about")
	public String getAbout() {
		return "About";
	}

	@GetMapping("/home")
	public String getHome() {
		return "home";
	}

	@GetMapping("/rubrica")
	public String getRubrica() {
		return "rubrica";
	}
	
}
