package com.zohocrm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zohocrm.entities.Contacts;
import com.zohocrm.services.ContactsService;

@Controller
public class ContactsController {
	
	@Autowired
	private ContactsService contactsService;

	@RequestMapping("/contacts")
	public String contacts(Model model) {
		List<Contacts> allContacts = contactsService.getAllContacts();
		model.addAttribute("allContacts", allContacts);
		return "list_contacts";
	}
}
