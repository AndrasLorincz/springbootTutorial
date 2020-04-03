package eu.pontsystems.tutorial.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class JobService {
	
	@Scheduled(cron = "${tutorial.profile.cron}")
	public void job1() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now(); 
		System.out.println("Lefut a job" + dtf.format(now));
	}

}
