package com.example.restapi.service;

import com.example.restapi.model.Contact;
import com.example.restapi.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    @Autowired
    private ContactRepository repository;

    public Contact save(Contact contact) {
        return repository.save(contact);
    }

    public List<Contact> getAll() {
        return repository.findAll();
    }

    public Contact getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
    public List<Contact> saveAll(List<Contact> contacts) {
        return repository.saveAll(contacts);
    }

}