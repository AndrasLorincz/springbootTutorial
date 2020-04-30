package eu.pontsystems.tutorial.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
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
	
	
	public Page<User> osszesUser(Pageable pageable){
		
		return ur.findAll(pageable);
		
	}


	
	
	
}
