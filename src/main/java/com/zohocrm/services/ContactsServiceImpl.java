package com.zohocrm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entities.Contacts;
import com.zohocrm.repositories.ContactsRepository;

@Service
public class ContactsServiceImpl implements ContactsService {
	
	@Autowired
	private ContactsRepository contactsRepo;

	@Override
	public void saveContact(Contacts contacts) {

		contactsRepo.save(contacts);
	}

	@Override
	public List<Contacts> getAllContacts() {

		return contactsRepo.findAll();
	}

	@Override
	public Contacts getContact(long id) {
		Optional<Contacts> findById = contactsRepo.findById(id);
		Contacts contacts = findById.get();
		return contacts;
	}

}
