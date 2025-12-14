package com.example.restapi.controller;

import com.example.restapi.model.Contact;
import com.example.restapi.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contacts")
public class ContactController {

    @Autowired
    private ContactService service;

    // TEST URL
    @GetMapping("/test")
    public String test() {
        return "Contact API Working";
    }

    // SAVE CONTACT
    @PostMapping("/save")
    public Contact saveContact(@RequestBody Contact contact) {
        return service.save(contact);
    }

    // GET ALL CONTACTS
    @GetMapping("/all")
    public List<Contact> getAllContacts() {
        return service.getAll();
    }

    // GET BY ID
    @GetMapping("/id/{id}")
    public Contact getContact(@PathVariable Long id) {
        return service.getById(id);
    }

    // DELETE
    @DeleteMapping("/delete/{id}")
    public String deleteContact(@PathVariable Long id) {
        service.delete(id);
        return "Contact deleted successfully";
    }
    @PostMapping("/saveAll")
    public List<Contact> saveAllContacts(@RequestBody List<Contact> contacts) {
        return service.saveAll(contacts);
    }

}
