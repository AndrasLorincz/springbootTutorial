package eu.pontsystems.tutorial.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import eu.pontsystems.tutorial.entity.User;


public interface UserService {

	public void mentes(User User);
	
	public Page<User> osszesUser(Pageable pageable);
}
