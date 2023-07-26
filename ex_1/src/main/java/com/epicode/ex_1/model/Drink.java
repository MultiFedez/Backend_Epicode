package com.epicode.ex_1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Drink implements FoodItem {
	private String name;
	private Double price;
	private Double calories;
	
	public String getMenuLine() {
		return this.name + " - caloreis: " + this.calories + " - price: " + this.price;  
	}
}
