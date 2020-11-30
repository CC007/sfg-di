package com.github.cc007.sfgdi.services;

public class PrimaryGreetingService implements GreetingService
{
	@Override
	public String sayGreeting()
	{
		return "Hello World! - From the PRIMARY bean";
	}
}
