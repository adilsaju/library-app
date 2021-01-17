package com.adil.library.controller;

import java.util.List;
import java.util.Map;

import com.adil.library.model.Author;
import com.adil.library.model.Book;
import com.adil.library.repositories.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class BookController {
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
		System.err.println(repo.findById(1));
		
		// String abc= "abc list";
		// mv.addObject("books", abc);
		// mv.addObject("books2", abc);
		mv.addObject("books", repo.findAll());
		System.out.println(mv.getModel());
		return mv;
	}

	@GetMapping("/add/book")
	public ModelAndView addBookForm() {
		ModelAndView mv = new ModelAndView("add-book");
		return mv;
	}
	@PostMapping(value="/add/book",consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public String addBookPostSubmit(@RequestBody MultiValueMap<String,String> abc) {
		System.out.println("kaa***************");
		System.out.println(abc.get("bid").get(0));
		System.out.println(abc.get("bname").get(0));
		Book book1 = new Book(Integer.parseInt(abc.get("bid").get(0)),abc.get("bname").get(0));
		System.out.println("book1***************");
		System.out.println(book1);
		// TODO: get session ...
		repo.save(book1);
		return String.format("successfully added  %s",abc);
	}
}
