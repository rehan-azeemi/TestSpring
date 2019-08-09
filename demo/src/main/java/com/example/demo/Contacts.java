package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Contacts {
	
	@GetMapping("/contacts")
	public List<ContactModel> getContacts() {
		List<ContactModel> list = new ArrayList<ContactModel>();
		list.add(new ContactModel(123L, "Rehan Ali", "rehan@gmail.com"));
		list.add(new ContactModel(123L, "Ali Ahmad", "ali@gmail.com"));
		list.add(new ContactModel(123L, "Tahir Hassan", "Tahir@gmail.com"));
		list.add(new ContactModel(123L, "Adil Rehman", "adil@gmail.com"));
		list.add(new ContactModel(123L, "Faisal Raza", "raza@gmail.com"));
		return list;
	}
}
