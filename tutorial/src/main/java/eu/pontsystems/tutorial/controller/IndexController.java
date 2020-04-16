package eu.pontsystems.tutorial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import eu.pontsystems.tutorial.entity.User;
import eu.pontsystems.tutorial.service.UserService;

@Controller
public class IndexController {
	
	@Autowired
	private UserController uc;
	
	@GetMapping(value = {"/","index"})
	public String view(Model model) {
		model.addAttribute("viewName","main");
		return "index";
		
	}
	
	@GetMapping(value = "/userMentes")
	public String userMentesView(Model model) {
		model.addAttribute("viewName","saveUser");
		return "index";
		
	}
	
	
	
	
}
