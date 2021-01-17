package com.adil.library.controller;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.adil.library.model.Author;
import com.adil.library.model.Book;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Bal {

    @GetMapping("/article")
    public ModelAndView displayArticle(Map<String, Object> model) {
    

    
        model.put("articles", "abc");
    
        return new ModelAndView("index", model);
    }
}
