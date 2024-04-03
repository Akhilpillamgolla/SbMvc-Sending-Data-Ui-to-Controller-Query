package com.SpringMvc.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {
	
	@GetMapping("/welcome")
	public String displayWelcomemsg(@RequestParam("name")String names, Model model) {   //name - key | names - variable that store String Value | Model used to send Data

		
		String msgText = names.concat(",Welcome to Spring Mvc....!!");  // key name & variable name can be different 
		model.addAttribute("msgs", msgText);
		
		
		
		
		return "index";   // index - logical view name 
	}
	
         

}
