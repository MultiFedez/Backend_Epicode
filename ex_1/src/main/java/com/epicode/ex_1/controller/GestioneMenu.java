package com.epicode.ex_1.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.epicode.ex_1.configuration.MenuConfiguration;
import com.epicode.ex_1.model.Menu;

public class GestioneMenu {

	AnnotationConfigApplicationContext appContext;
	Menu menu;

	public GestioneMenu() {
		appContext = new AnnotationConfigApplicationContext(MenuConfiguration.class);
		menu = (Menu) appContext.getBean("menu");
	}
	
	public void stampaMenu() {
		System.out.println("***** Menu *****");
		System.out.println("Pizzas");
		
		menu.getMenuPizza().forEach(p -> System.out.println(p.getMenuLine()));
		
		System.out.println();
		
		System.out.println("Drink");
		
		menu.getMenuDrink().forEach(d -> System.out.println(d.getMenuLine()));
		
		System.out.println();
		
		System.out.println("***** FINE *****");
		
	}

}
