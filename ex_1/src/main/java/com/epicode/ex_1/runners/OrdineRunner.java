package com.epicode.ex_1.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.epicode.ex_1.model.DrinkLemonade;
import com.epicode.ex_1.model.Ordine;
import com.epicode.ex_1.model.PizzaMargherita;
import com.epicode.ex_1.model.PizzaSalami;
import com.epicode.ex_1.model.Tavolo;
import com.epicode.ex_1.model.Water;
import com.epicode.ex_1.services.OrdineService;

@Component
public class OrdineRunner implements CommandLineRunner {

	@Autowired OrdineService os;

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Run.. OrdineRunner");
		
		Tavolo t1 = os.creaTavolo(1, 4);
		Tavolo t2 = os.creaTavolo(2, 6);
		Tavolo t3 = os.creaTavolo(3, 2);
		
		Ordine o1 = os.creaOrdine(1, 3, t1);
		
		PizzaMargherita pm = (PizzaMargherita) os.getMenu().getMenuPizza().get(0);
		PizzaSalami ps = (PizzaSalami) os.getMenu().getMenuPizza().get(2);
		DrinkLemonade dlem = (DrinkLemonade) os.getMenu().getMenuDrink().get(0);
		Water wa = (Water) os.getMenu().getMenuDrink().get(1);
		o1.addMenuItem(pm);
		o1.addMenuItem(pm);
		o1.addMenuItem(dlem);
		o1.addMenuItem(ps);
		o1.addMenuItem(wa);
		o1.addMenuItem(wa);
		
		System.out.println(o1);
		o1.getTotale();
		
	}
}
