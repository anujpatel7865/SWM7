package com.isrdc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
 
	@GetMapping("/act")
	public ModelAndView action() {
		ModelAndView mav= new ModelAndView();
		
		mav.setViewName("show");
		
		return mav;
		
	}
		
	    @GetMapping("/abc")
		public ModelAndView info() {
			ModelAndView mav= new ModelAndView();
			
			mav.addObject("college","Srit");
			mav.setViewName("next");
			
			return mav;
		}
		
	} 

