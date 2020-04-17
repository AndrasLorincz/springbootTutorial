package eu.pontsystems.tutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@GetMapping(value = {"/","index"})
	public String view(Model model) {
		model.addAttribute("viewName","main");
		model.addAttribute("pageName","Főoldal");
		return "index";
		
	}
	
	@GetMapping(value = "/userMentes")
	public String userMentesView(Model model) {
		model.addAttribute("viewName","saveUser");
		model.addAttribute("pageName","User mentés");
		return "index";
		
	}
	
	
	
	
}
