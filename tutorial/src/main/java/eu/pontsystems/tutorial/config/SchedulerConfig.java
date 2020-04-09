package eu.pontsystems.tutorial.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import eu.pontsystems.tutorial.job.PrintJob;

@Configuration
@EnableScheduling
public class SchedulerConfig {

	@Bean
	public PrintJob printjob() {
		return new PrintJob();
	}
}
