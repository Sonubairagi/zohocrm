package com.zohocrm.services;

import java.util.List;

import com.zohocrm.entities.Contacts;

public interface ContactsService {

	void saveContact(Contacts contacts);

	List<Contacts> getAllContacts();

	Contacts getContact(long id);

}
