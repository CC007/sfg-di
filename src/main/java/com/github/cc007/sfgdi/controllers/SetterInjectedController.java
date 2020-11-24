package com.github.cc007.sfgdi.controllers;

import com.github.cc007.sfgdi.services.GreetingService;

public class SetterInjectedController
{

	private GreetingService greetingService;

	public void setGreetingService(GreetingService greetingService)
	{
		this.greetingService = greetingService;
	}

	public String getGreeting(){
		return greetingService.sayGreeting();
	}

}
