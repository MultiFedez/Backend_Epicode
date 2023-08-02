package com.epicode.pagina_personale.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.epicode.pagina_personale.service.ContactService;

@Component
public class ContactRunner implements ApplicationRunner {
	@Autowired ContactService contactService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("ContactRunner...");
		
		for(int i = 0; i < 10; i++) {
			contactService.createFakeContact();
		}
	}
}
