package com.epicode.pagina_personale.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.epicode.pagina_personale.model.Contacts;

@Controller
public class ContactController {

	@GetMapping("/about")
	public String getAbout() {
		return "About";
	}

	@GetMapping("/home")
	public String getHome() {
		return "home";
	}

	@GetMapping("/rubrica")
	public ModelAndView getRubrica() {
		List<Contacts> listaContatti = ContactsService.getAllContacts();
		//System.out.println(listaContatti.size());
		//listaContatti.forEach(c -> System.out.println(c));
		ModelAndView model = new ModelAndView("rubrica"); // nome della pagina html che voglio richiamare
		model.addObject("lista", listaContatti);
		return model;
	}
	
}
