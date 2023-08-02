package com.epicode.pagina_personale.configuration;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.pagina_personale.model.Contacts;

@Configuration
public class ContactConfiguration {

		@Bean("contactBean")
		@Scope("prototype")
		public Contacts customContact() {
			return new Contacts();
		}
		
		@Bean("fakeContactBean")
		@Scope("prototype")
		public Contacts fakeContact() {
			Faker faker = new Faker(new Locale("it-IT"));
			Contacts c = new Contacts();
			String name = faker.name().firstName();
			String lastname = faker.name().lastName();
			c.setName(name);
			c.setLastname(lastname);
			c.setCity(faker.address().cityName());
			c.setAge(faker.number().numberBetween(18, 80));
			c.setEmail(name.toLowerCase()+"."+lastname.toLowerCase()+"@example.com");
			c.setPassword(faker.internet().password());
			return c;
		}
}
