package com.adil.library.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan
@RestController
public class ListBookController {
    
    @GetMapping("/list")
	@ResponseBody
	public String getBook() {
		
		return "hello books";
	}
}
