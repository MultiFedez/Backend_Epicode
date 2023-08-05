package com.epicode.gestione_device.security.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.epicode.gestione_device.security.entity.Laptop;
import com.epicode.gestione_device.security.entity.Smartphone;
import com.epicode.gestione_device.security.entity.Tablet;
import com.epicode.gestione_device.security.service.DispositivoService;

@Component
public class DispositivoRunner implements ApplicationRunner {
	
	@Autowired DispositivoService dservice;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {		
//		dservice.createDispositivo(new Smartphone());
//		dservice.createDispositivo(new Smartphone());
//		
//		dservice.createDispositivo(new Laptop());
//		dservice.createDispositivo(new Laptop());
//		
//		dservice.createDispositivo(new Tablet());
//		dservice.createDispositivo(new Tablet());
		
		//dservice.assegnaSmartphone(1);
		//dservice.assegnaTablet(1);
		//dservice.assegnaLaptop(1);
		
		//dservice.manutenzione(3);
		
	}
	
	
}
