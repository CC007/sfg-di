package com.github.cc007.sfgdi.config;

import com.github.cc007.sfgdi.services.GreetingService;
import com.github.cc007.sfgdi.services.GreetingServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig
{
	@Bean
	GreetingServiceFactory greetingServiceFactory(){
		return new GreetingServiceFactory();
	}

	@Bean("i18nService")
	@Profile("EN")
	GreetingService englishGreetingService(GreetingServiceFactory greetingServiceFactory){
		return greetingServiceFactory.createGreetingService("en");
	}

	@Bean("i18nService")
	@Profile({"ES", "default"})
	GreetingService spanishGreetingService(GreetingServiceFactory greetingServiceFactory){
		return greetingServiceFactory.createGreetingService("es");
	}

	@Bean
	@Primary
	GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory){
		return greetingServiceFactory.createGreetingService("");
	}
}
