package eu.pontsystems.tutorial.service;

import java.util.List;

import org.springframework.data.domain.Page;

import eu.pontsystems.tutorial.entity.User;


public interface UserService {

	public void mentes(User User);
	
	public List<User> osszesUser();
}
