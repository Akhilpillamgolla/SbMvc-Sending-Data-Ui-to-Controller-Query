package com.SpringMvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookControllerMultipleInput {

	@GetMapping("/BookDetails")
	
	public String getBookPrice(@RequestParam("book")String bookName, @RequestParam("author") String authorname,Model model){
		
		String msgtxt =  " Price of " + bookName + " Written by " + authorname + " is :550.00 ₹ ";
	
		model.addAttribute("msgs", msgtxt);

		return "index";
		
		
		// URL - http://localhost:9093/BookDetails?book=java&author=akhil  
	}
	
}
