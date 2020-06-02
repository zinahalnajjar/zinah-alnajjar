package com.Portfolio.MyPortfolio;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class SimpleController {

	@GetMapping("/ui/upload")
	public String MyPortfolio(Model model) {

		return "upload";

	}

	@PostMapping("/uploadartwork")
	public String uploadartwork(@RequestParam("artworkfile") MultipartFile file, Model model) {
		
		if (file!= null) 
			model.addAttribute("Message", "upload successful");
		return "upload";

	}

}