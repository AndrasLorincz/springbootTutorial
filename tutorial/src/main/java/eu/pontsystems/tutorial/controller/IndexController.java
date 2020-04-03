package eu.pontsystems.tutorial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import eu.pontsystems.tutorial.entity.User;
import eu.pontsystems.tutorial.service.UserService;

@RestController
public class IndexController {
	
	@Autowired
	private UserService us;

	@GetMapping(value = "/index")
//	@RequestMapping(method = RequestMethod.GET , value = "index")
	public ModelAndView view() {
		ModelAndView mav = new ModelAndView("index");
		return mav;
		
	}
	
	@PostMapping(value = "/mentes")
	//@RequestMapping(method = RequestMethod.POST , value = "/mentes")
	public ModelAndView mentes(User user) {
		
		//User user=new User(name);
		us.mentes(user);
		ModelAndView mav = new ModelAndView("index");
		return mav;
		
	}
	
	
}
