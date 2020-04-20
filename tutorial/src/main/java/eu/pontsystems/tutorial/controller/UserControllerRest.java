package eu.pontsystems.tutorial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
	//@RequestMapping(method = RequestMethod.GET , value="/kiir") List<User>
	public List<User> kiir(Model model,@RequestParam(defaultValue = "0") Integer page,@RequestParam(defaultValue = "id") String sort,@RequestParam(defaultValue="1") Integer count) {
		if (count<1 ) {
			count=1;
		}
		Pageable ElementsPerPage = PageRequest.of(page, count,Sort.by(sort));
		Page<User> osszUserPage=us.osszesUser(ElementsPerPage);
		List<User> osszUser=osszUserPage.getContent();
		return osszUser;
		
	}
	
	@PostMapping(value = "/api/mentes")
	public ResponseEntity<String> mentes(Model model,User user) {
		
		us.mentes(user);
		return new ResponseEntity<String>(HttpStatus.OK);
		
	}
}
