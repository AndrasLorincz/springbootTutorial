package eu.pontsystems.tutorial.bootstrap;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import eu.pontsystems.tutorial.entity.User;
import eu.pontsystems.tutorial.repository.UserRepository;

@Component
public class PopulateDb implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	private UserRepository ur;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		Random rd=new Random();
		
		User sanyi=new User();
		sanyi.setName("sanyi");
		sanyi.setEmail("aa@bb.hu");
		sanyi.setAge(rd.nextInt(99)+1);
		sanyi.setPassword(encoder.encode("123"));
		sanyi.setRoles("ROLE_USER,ROLE_ADMIN");
		sanyi.setActive(true);
		
		User zoli=new User();
		zoli.setName("zoli");
		zoli.setEmail("aa@bb.hu");
		zoli.setAge(rd.nextInt(99)+1);
		zoli.setPassword(encoder.encode("123abc"));
		zoli.setRoles("ROLE_GUEST");
		zoli.setActive(true);
		
		User bela=new User();
		bela.setName("Béla");
		bela.setEmail("aaa@bb.hu");
		bela.setAge(rd.nextInt(99)+1);
		
		User judit=new User();
		judit.setName("Judit");
		judit.setEmail("aaa@bb.hu");
		judit.setAge(rd.nextInt(99)+1);
		
		User zsofi=new User();
		zsofi.setName("Zsófi");
		zsofi.setEmail("aaa@bb.hu");
		zsofi.setAge(rd.nextInt(99)+1);
		
		User aniko=new User();
		aniko.setName("Anikó");
		aniko.setEmail("aaa@bb.hu");
		aniko.setAge(rd.nextInt(99)+1);
		
		User albert=new User();
		albert.setName("Albert");
		albert.setEmail("aaa@bb.hu");
		albert.setAge(rd.nextInt(99)+1);
		
		List<User> dummys=new ArrayList<User>();
		
		dummys.add(sanyi);
		dummys.add(zoli);
		dummys.add(bela);
		dummys.add(judit);
		dummys.add(zsofi);
		dummys.add(aniko);
		dummys.add(albert);
		
		ur.saveAll(dummys);
	}

}
