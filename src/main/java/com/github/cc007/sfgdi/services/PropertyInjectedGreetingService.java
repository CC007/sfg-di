package com.github.cc007.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingService
{
	@Override
	public String sayGreeting()
	{
		return "Hello World! - Property";
	}
}
