package com.epicode.ex_1.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

@Getter
public class Menu {
	
	private List<PizzaBase> menuPizza = new ArrayList<PizzaBase>();
	private List<Drink> menuDrink = new ArrayList<Drink>();

}
