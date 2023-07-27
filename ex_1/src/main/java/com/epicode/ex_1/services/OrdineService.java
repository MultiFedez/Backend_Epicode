package com.epicode.ex_1.services;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.epicode.ex_1.model.FoodItem;
import com.epicode.ex_1.model.Menu;
import com.epicode.ex_1.model.Ordine;
import com.epicode.ex_1.model.Tavolo;

@Service
public class OrdineService {
	
	@Autowired @Qualifier("generaTavolo") ObjectProvider<Tavolo> tavoloProvider;
	@Autowired @Qualifier("generaOrdine") ObjectProvider<Ordine> ordineProvider;
	@Autowired @Qualifier("menupizzeria") private ObjectProvider<Menu> menuProvider;
	
	public Ordine creaOrdine(Integer numeroOrdine, Integer numeroCoperti, Tavolo tavolo) {
		tavolo.setOccupato(true);
		Ordine o = ordineProvider.getObject();
		o.setNumeroOrdine(numeroOrdine);
		o.setNumeroCoperti(numeroCoperti);
		o.setTavolo(tavolo);
		return o;
	}
	
	public Tavolo creaTavolo(Integer numero, Integer numeroMassimoCoperti) {
		Tavolo t = tavoloProvider.getObject();
		t.setNumero(numero);
		t.setNumeroMassimoCoperti(numeroMassimoCoperti);
		t.setOccupato(false);
		return t;
	}

	public void addOrdine(FoodItem item, Ordine o) {
		o.getOrdinato().put(item, 1);
		System.out.println(item.getName() + " aggiunto al tuo ordine n." + o.getNumeroOrdine());
	}
	
	public Menu getMenu() {
		return menuProvider.getObject();
	}

}
