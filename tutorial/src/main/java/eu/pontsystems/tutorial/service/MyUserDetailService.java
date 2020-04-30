package eu.pontsystems.tutorial.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import eu.pontsystems.tutorial.entity.MyUserDetails;
import eu.pontsystems.tutorial.entity.User;
import eu.pontsystems.tutorial.repository.UserRepository;

@Service
public class MyUserDetailService implements UserDetailsService{

	@Autowired
	private UserRepository ur;
	
	
	@Override
	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
		
		
		Optional<User> user=ur.findByName(name);
		
		user.orElseThrow(()-> new UsernameNotFoundException("Not found: "+name));
		
		return user.map(MyUserDetails::new).get();
	}
	
	
	

}
