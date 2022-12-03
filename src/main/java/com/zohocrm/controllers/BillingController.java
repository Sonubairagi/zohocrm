package com.zohocrm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Billing;
import com.zohocrm.entities.Contacts;
import com.zohocrm.services.BillingService;
import com.zohocrm.services.ContactsService;

@Controller
public class BillingController {
	
	@Autowired
	private ContactsService contactsService;
	
	@Autowired
	private BillingService billingService;

	@RequestMapping("/bill")
	public String bill(@RequestParam("id") long id,Model model) {
		Contacts contact = contactsService.getContact(id);
		model.addAttribute("contact", contact);
		return "generate_bill";
	}
	
	@RequestMapping("/generateBill")
	public String generateBill(@ModelAttribute("b") Billing billing,Model model) {
		billingService.billingInvoce(billing);
		model.addAttribute("msg", "Bill is generated");
		return "generate_bill";
	}
}
