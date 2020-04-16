package eu.pontsystems.tutorial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import eu.pontsystems.tutorial.entity.User;
import eu.pontsystems.tutorial.service.UserServiceImpl;

@RestController
public class UserControllerRest {
	
	@Autowired
	private UserServiceImpl us;

	@GetMapping(value = "/api/kiir")
	//@RequestMapping(method = RequestMethod.GET , value="/kiir")
	public List<User> kiir(Model model) {
		List<User> osszUser=us.osszesUser();
		model.addAttribute("userek",osszUser);
		return osszUser;
		
	}
	
	@PostMapping(value = "/api/mentes")
	public ResponseEntity<String> mentes(Model model,User user) {
		
		us.mentes(user);
		return new ResponseEntity<String>(HttpStatus.ACCEPTED);
		
	}
}
