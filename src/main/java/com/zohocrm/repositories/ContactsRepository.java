package com.zohocrm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm.entities.Contacts;

public interface ContactsRepository extends JpaRepository<Contacts, Long> {

}
