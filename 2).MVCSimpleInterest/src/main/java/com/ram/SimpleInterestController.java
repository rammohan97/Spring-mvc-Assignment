package com.ram;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class SimpleInterestController {
		@RequestMapping(value="/simple.html",method=RequestMethod.GET)
		public ModelAndView getSimpleForm() {
			ModelAndView model=new ModelAndView("Simple");
			return model;		
		}
		@RequestMapping(value="/result.html",method=RequestMethod.POST)
		public ModelAndView resultForm(@RequestParam("val") int povalue,@RequestParam("rate9812") int rate98,@RequestParam("time11") int time123) {
			ModelAndView model=new ModelAndView("Result");
			
			model.addObject("message"," Details submitted by you is : Principal: " +povalue+" rate: "+rate98+" percentage "+"\t time: "+time123+" months ");
			double simple;
			simple=(povalue*rate98*time123)/100;
			model.addObject("message1"," Simple Interest: "+simple);
			
			return model;		
		}
	}

