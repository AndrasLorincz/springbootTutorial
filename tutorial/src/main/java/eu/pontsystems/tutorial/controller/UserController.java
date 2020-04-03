package eu.pontsystems.tutorial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import eu.pontsystems.tutorial.entity.User;
import eu.pontsystems.tutorial.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService us;

	@GetMapping(value = "/kiir")
	//@RequestMapping(method = RequestMethod.GET , value="/kiir")
	public String kiir(Model model) {
		List<User> osszUser=us.osszesUser();
		model.addAttribute("userek",osszUser);
		return "osszesUser";
		
	}
}
