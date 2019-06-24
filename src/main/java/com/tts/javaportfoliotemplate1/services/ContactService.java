package com.tts.javaportfoliotemplate1.services;

import com.tts.javaportfoliotemplate1.models.Contact;
import com.tts.javaportfoliotemplate1.repositories.ContactRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

  @Autowired
  private ContactRepository contactRepo;

  public void save(Contact contact) {
    contactRepo.save(contact);
  }

 public Contact findByEmail(String email) {
   return contactRepo.findByEmail(email);
 }

  
}