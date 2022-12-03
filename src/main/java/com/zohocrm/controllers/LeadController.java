package com.zohocrm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Contacts;
import com.zohocrm.entities.Lead;
import com.zohocrm.services.ContactsService;
import com.zohocrm.services.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadService;
	
	@Autowired
	private ContactsService contactsService;

	@RequestMapping(value = "/zohocrmapp",method = RequestMethod.GET)
	public String createLead() {
		return "create_lead";
	}
	
	@RequestMapping(value = "/saveLead",method = RequestMethod.POST)
	public String saveLead(@ModelAttribute("lead") Lead lead,Model model) {
		leadService.saveLeadInfo(lead);
		model.addAttribute("lead", lead);
		return "lead_info";
	}
	
	@RequestMapping("/listLead")
	public String listLead(Model model) {
		List<Lead> leads = leadService.getAllLeads();
		model.addAttribute("leads", leads);
		return "listLead";
	}
	
	@RequestMapping("/leadInfo")
	public String leadInfo(@RequestParam("id") long id,Model model) {
		Lead lead = leadService.getOneLead(id);
		model.addAttribute("lead", lead);
		return "lead_info";
	}
	
	@RequestMapping("/convertLead")
	public String convertLead(@RequestParam("id") long id,Model model) {
		Lead lead = leadService.getOneLead(id);
		Contacts contacts = new Contacts();
		contacts.setFirstName(lead.getFirstName());
		contacts.setLastName(lead.getLastName());
		contacts.setEmail(lead.getEmail());
		contacts.setMobile(lead.getMobile());
		contacts.setSource(lead.getSource());
		
		contactsService.saveContact(contacts);
		leadService.deleteLead(id);
		List<Contacts> allContacts = contactsService.getAllContacts();
		model.addAttribute("allContacts", allContacts);
		return "list_contacts";
	}
	
}
