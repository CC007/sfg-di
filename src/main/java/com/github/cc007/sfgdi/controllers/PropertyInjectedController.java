package com.github.cc007.sfgdi.controllers;

import com.github.cc007.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController
{

	@Autowired
	@Qualifier("propertyInjectedGreetingService")
	public GreetingService greetingService;

	public String getGreeting(){
		return greetingService.sayGreeting();
	}
}
