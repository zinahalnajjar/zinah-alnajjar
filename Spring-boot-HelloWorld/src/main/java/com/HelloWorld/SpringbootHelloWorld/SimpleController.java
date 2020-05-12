package com.HelloWorld.SpringbootHelloWorld;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SimpleController {
	
	 @GetMapping("/")
	 public String homePage(Model model) {
		 model.addAttribute("news", "Covid-19 has killed alot of people blah blah blah");
		 return "hello";
		 
	 }
	 @GetMapping("/addbreakingnews")
	 public String addbreakingnews() {
		 
		 return "addbreakingnews";
		 
	 }
	 
	

	 
	

}
