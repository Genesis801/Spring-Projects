package com.capgemini.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	String name ="Genesis";
	String mobile="96741332442";
	String email="deba@gmail.com";
	
	@RequestMapping("/name")
	public ModelAndView showName() {
		System.out.println("In Bio Data Controller");
		ModelAndView mv=new ModelAndView("helloworld");
		mv.addObject("name",name);
		return mv;
	}
	@RequestMapping("/mobile")
	public ModelAndView showMobile() {
		System.out.println("In Bio Data Controller");
		ModelAndView mv=new ModelAndView("helloworld");
		mv.addObject("mobile",mobile);
		return mv;
	}
	
	@RequestMapping("/email")
	public ModelAndView showEmail() {
		System.out.println("In Bio Data Controller");
		ModelAndView mv=new ModelAndView("helloworld");
		mv.addObject("email",email);
		return mv;
	}
}
