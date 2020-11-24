package com.github.cc007.sfgdi.controllers;

import com.github.cc007.sfgdi.services.GreetingService;

public class PropertyInjectedController
{
	public GreetingService greetingService;

	public String getGreeting(){
		return greetingService.sayGreeting();
	}
}
