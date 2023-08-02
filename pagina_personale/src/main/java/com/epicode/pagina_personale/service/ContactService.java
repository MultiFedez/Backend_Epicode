package com.epicode.pagina_personale.service;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
	
		@Autowired ContactRepository contactRepo;
		@Autowired @Qaulifier("ContactBean") private ObjectProvider<Contact> contact

		public void createFakeContact() {
			Contacts c = contactsProvider.getObject();
			contactRepo.save(c);
		}
		
		public List<Contact> getAllContacts() {
			return (List<Contact>) contactRepo.findAll();
		}
		
		public Contact getContactsByID(Long id) {
			return contactRepo.findById(id).get();
		}
		
}
