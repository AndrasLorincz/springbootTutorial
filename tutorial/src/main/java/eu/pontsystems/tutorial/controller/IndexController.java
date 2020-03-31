package eu.pontsystems.tutorial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import eu.pontsystems.tutorial.entity.User;
import eu.pontsystems.tutorial.service.UserService;

@Controller
public class IndexController {
	
	@Autowired
	private UserService us;

	@RequestMapping(method = RequestMethod.GET , value = "index")
	public String view() {
		return "index";
		
	}
	
	@RequestMapping(method = RequestMethod.POST , value = "mentes")
	public String mentes(User user) {
		
		//User user=new User(name);
		us.mentes(user);
		return "index";
		
	}
	
	@RequestMapping(method = RequestMethod.GET , value="kiir")
	public String kiir(Model model) {
		List<User> osszUser=us.osszesUser();
		model.addAttribute("userek",osszUser);
		return "osszesUser";
		
	}
}
