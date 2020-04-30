package eu.pontsystems.tutorial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import eu.pontsystems.tutorial.entity.MyUserDetails;
import eu.pontsystems.tutorial.service.MyUserDetailService;

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
	
	//Hozzáférés megtagadva oldal A SecurityConfigban beállítva
	
	@GetMapping(value = "/accessdenied")
	public String accessDenied(Model model) {
		model.addAttribute("viewName","accessdenied");
		model.addAttribute("pageName","Access Denied");
		return "index";
	}
	
	
}
