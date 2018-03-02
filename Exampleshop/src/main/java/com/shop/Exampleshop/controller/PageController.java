package com.shop.Exampleshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@RequestMapping(value= {"/","/index","/home"})		
	public ModelAndView index() {
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greet", "we are in spring mvc");
		return mv;
		
	}

	@RequestMapping("/test")
	public ModelAndView test(@RequestParam(value = "greet" ,required = false) String greet) 
	{
		if(greet == null) {
			
			greet = "hello";
		}
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greet", greet);
		return mv;
		
	}
	
	
	
//	@RequestMapping("/test/{greet}")
//	public ModelAndView test(@PathVariable( "greet" ) String greet) 
//	{
//		if(greet == null) {
//			
//			greet = "hello";
//		}
//		
//		ModelAndView mv = new ModelAndView("page");
//		mv.addObject("greet", greet);
//		return mv;
//		
//	}
}
