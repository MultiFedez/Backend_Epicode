package com.epicode.systemFire.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.epicode.systemFire.service.SondaService;

@Component
public class IncendioRunner implements ApplicationRunner {
	@Autowired SondaService SondaSvc;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
	}
}
