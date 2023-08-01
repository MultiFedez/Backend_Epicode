package com.epicode.pagina_personale.service;

import org.springframework.stereotype.Service;

@Service
public class ContactService {

		@Autowired @Qaulifier("ContactBean") private ObjectProvider<Contact> contact
}
