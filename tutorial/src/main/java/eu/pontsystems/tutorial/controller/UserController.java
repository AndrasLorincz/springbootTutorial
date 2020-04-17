package eu.pontsystems.tutorial.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import eu.pontsystems.tutorial.entity.User;
import eu.pontsystems.tutorial.service.UserServiceImpl;

@Controller
public class UserController {
	
	@Autowired
	private UserServiceImpl us;

	@GetMapping(value = "/kiir")
	public String kiir(Model model,@RequestParam Integer page,@RequestParam String sort,@RequestParam(defaultValue="1") Integer count) {
		
		System.out.println(count);
		
		if (count<1 ) {
			count=1;
		}
		
		
		Pageable ElementsPerPage = PageRequest.of(page, count,Sort.by(sort));
		Page<User> osszUser=us.osszesUser(ElementsPerPage);
		
		//alternatív megoldás hogy lekezelje ha szűrés után nyobb oldalon áll a felhasználó mint amennyi van
//		if (page>osszUser.getTotalPages()) {
//			ElementsPerPage = PageRequest.of(0, count,Sort.by(sort));
//			osszUser=us.osszesUser(ElementsPerPage);
//		}
		
		model.addAttribute("viewName","osszesUser");
		model.addAttribute("pageName","User Lista");
		model.addAttribute("sort",sort);
		model.addAttribute("count",count);
		model.addAttribute("userek",osszUser.getContent());
		model.addAttribute("number",osszUser.getNumber());
		model.addAttribute("totalPages",osszUser.getTotalPages());
		model.addAttribute("totalElements",osszUser.getTotalElements());
		model.addAttribute("size",osszUser.getSize());
		return "index";
		
	}
	
	
	@PostMapping(value = "/mentes")
	public String mentes(Model model,User user) {
		
		us.mentes(user);
		model.addAttribute("viewName","saveUser");
		return "index";
		
	}
}
