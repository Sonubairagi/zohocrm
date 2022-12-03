package com.zohocrm.services;

import java.util.List;

import com.zohocrm.entities.Lead;

public interface LeadService {

	void saveLeadInfo(Lead lead);

	List<Lead> getAllLeads();

	Lead getOneLead(long id);

	void deleteLead(long id);

}
