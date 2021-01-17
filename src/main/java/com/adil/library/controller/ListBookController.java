package com.adil.library.controller;

import com.adil.library.model.Author;
import com.adil.library.model.Book;
import com.adil.library.repositories.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ListBookController {
	@Autowired
	private BookRepository repo;
	// @GetMapping("/")
	// @ResponseBody
	// public String index() {
	// 	return "welcome!";
	// }

	// @GetMapping("/")
	// @ResponseBody
	// public String listBooks() {
	// 	Book book1 = new Book();
	// 	book1.setBname("alchemist");
		
	// 	Author a1 = new Author();
	// 	a1.setAname("Paulo Coelho");

	// 	// book1.setAuthor(a1);
	// 	return book1.toString();
	// }
	@GetMapping("/")
	public ModelAndView listBooks() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("book-list");
		System.out.println("kaa***************");
		System.err.println(repo.findById(1));
		
		// String abc= "abc list";
		// mv.addObject("books", abc);
		// mv.addObject("books2", abc);
		mv.addObject("books", repo.findAll());
		System.out.println(mv.getModel());
		return mv;
	}
}
