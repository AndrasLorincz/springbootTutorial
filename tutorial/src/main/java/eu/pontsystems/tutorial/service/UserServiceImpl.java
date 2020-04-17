package eu.pontsystems.tutorial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import eu.pontsystems.tutorial.entity.User;
import eu.pontsystems.tutorial.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository ur;

	public void mentes(User user) {
		ur.save(user);
	}
	
//	public List<User> osszesUser(){
//		Pageable firstPageWithTwoElements = PageRequest.of(0, 2);
//		Page<User> osszesUser=ur.findAll(firstPageWithTwoElements);
//		return osszesUser.getContent();
//		
//	}
	
	public Page<User> osszesUser(Pageable pageable){
		
		return ur.findAll(pageable);
		
	}
	
	
	
}
