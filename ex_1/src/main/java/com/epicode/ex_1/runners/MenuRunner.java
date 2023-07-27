package com.epicode.ex_1.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.epicode.ex_1.controller.GestioneMenu;
import com.epicode.ex_1.services.MenuService;


@Component
public class MenuRunner implements CommandLineRunner {
	
	@Autowired MenuService menu;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Run... MenuRunner");
		
		// Classe sostituita dal Service MenuService
		// GestioneMenu menu = new GestioneMenu();

		menu.stampaMenu();

	}


}
