package com.example.democlass5.controller;

import com.example.democlass5.Model.Model;
import com.example.democlass5.Model.RandomJokes;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class OurController {

    private RandomJokes randomJokes;
    @RequestMapping("/")
    //@ResponseBody
    public String OurController(){
        //return "List of all items in this page";
        return "index";
    }
}
