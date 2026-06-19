package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	@RequestMapping("/hi")
	@ResponseBody
	public String hi() {
		return "Hi Friend!!!";
	}
    @RequestMapping("/bye")
//    @ResponseBody
    public String bye() {
        return "google";
    }
}
