package com.adil.library.controller;

import com.adil.library.model.Author;
import com.adil.library.model.Book;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListBookController {

	// @GetMapping("/")
	// @ResponseBody
	// public String index() {
	// 	return "welcome!";
	// }

	@GetMapping("/")
	@ResponseBody
	public String listBooks() {
		Book book1 = new Book();
		book1.setBname("alchemist");

		Author a1 = new Author();
		a1.setAname("Paulo Coelho");

		// book1.setAuthor(a1);
		return book1.toString();
	}
}
