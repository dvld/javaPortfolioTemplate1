package com.tts.javaportfoliotemplate1.repositories;

import com.tts.javaportfoliotemplate1.models.Contact;

import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, Long> {
	
}