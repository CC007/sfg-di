package com.github.cc007.sfgdi.controllers;

import com.github.cc007.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest
{

	SetterInjectedController controller;

	@BeforeEach
	void setUp()
	{
		controller = new SetterInjectedController();
		controller.setGreetingService(new ConstructorGreetingService());
	}

	@Test
	void getGreeting()
	{
		System.out.println(controller.getGreeting());
	}
}