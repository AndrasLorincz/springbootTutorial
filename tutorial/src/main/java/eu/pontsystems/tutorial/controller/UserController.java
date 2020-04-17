package eu.pontsystems.tutorial.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import eu.pontsystems.tutorial.entity.User;
import eu.pontsystems.tutorial.service.UserServiceImpl;

@Controller
public class UserController {
	
	@Autowired
	private UserServiceImpl us;

	@GetMapping(value = "/kiir")
	//@RequestMapping(method = RequestMethod.GET , value="/kiir")
	public String kiir(Model model,@RequestParam Integer page) {
		Pageable firstPageWithTwoElements = PageRequest.of(page, 5);
		Page<User> osszUser=us.osszesUser(firstPageWithTwoElements);
		model.addAttribute("userek",osszUser.getContent());
		model.addAttribute("viewName","osszesUser");
		model.addAttribute("number",osszUser.getNumber());
		model.addAttribute("totalPages",osszUser.getTotalPages());
		model.addAttribute("totalElements",osszUser.getTotalElements());
		model.addAttribute("size",osszUser.getSize());
		System.out.println(osszUser);
		return "index";
		
	}
	
	@GetMapping(value = "/refresh")
	//@RequestMapping(method = RequestMethod.GET , value="/kiir")
	public String refresh(Model model,Pageable pageable) {
		Pageable firstPageWithTwoElements = PageRequest.of(0, 5);
		Page<User> osszUser=us.osszesUser(firstPageWithTwoElements);
		model.addAttribute("userek",osszUser.getContent());
		model.addAttribute("viewName","osszesUser");
		model.addAttribute("number",osszUser.getNumber());
		model.addAttribute("totalPages",osszUser.getTotalPages());
		model.addAttribute("totalElements",osszUser.getTotalElements());
		model.addAttribute("size",osszUser.getSize());
		System.out.println(osszUser);
		return "index";
		
	}
	
	@PostMapping(value = "/mentes")
	public String mentes(Model model,User user) {
		
		us.mentes(user);
		model.addAttribute("viewName","saveUser");
		return "index";
		
	}
}
