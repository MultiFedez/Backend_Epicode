package com.epicode.ex_1.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.ex_1.model.DrinkLemonade;
import com.epicode.ex_1.model.Menu;
import com.epicode.ex_1.model.PizzaHawaiian;
import com.epicode.ex_1.model.PizzaMargherita;
import com.epicode.ex_1.model.PizzaSalami;
import com.epicode.ex_1.model.Water;
import com.epicode.ex_1.model.Wine;

@Configuration
public class MenuConfiguration {
	
	@Bean("menupizzeria")
	@Scope("singleton") 
	public Menu menu() {
		Menu m = new Menu();
		
		m.getMenuPizza().add(pizzaMargherita());
		m.getMenuPizza().add(pizzaHawaiian());
		m.getMenuPizza().add(pizzaSalami());
		
		m.getMenuDrink().add(drinkLemonade());
		m.getMenuDrink().add(drinkWater());
		m.getMenuDrink().add(drinkWine());
		
		return m;
	}
	
	// bean Pizza
	
	@Bean
	@Scope("singleton")
	public PizzaMargherita pizzaMargherita() {
		return new PizzaMargherita();
	}
	
	@Bean
	@Scope("singleton")
	public PizzaHawaiian pizzaHawaiian() {
		return new PizzaHawaiian();
	}
	
	@Bean
	@Scope("singleton")
	public PizzaSalami pizzaSalami() {
		return new PizzaSalami();
	}

	// bean Drink
	
	@Bean
	@Scope("singleton")
	public DrinkLemonade drinkLemonade() {
		return new DrinkLemonade();
	}
	
	@Bean
	@Scope("singleton")
	public Water drinkWater() {
		return new Water();
	}
	
	@Bean
	@Scope("singleton")
	public Wine drinkWine() {
		return new Wine();
	}
}
