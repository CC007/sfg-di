package com.github.cc007.sfgdi.controllers;

import com.github.cc007.sfgdi.services.GreetingServiceImpl;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest
{
	ConstructorInjectedController controller;

	@BeforeEach
	void setUp()
	{
		controller = new ConstructorInjectedController(new GreetingServiceImpl());
	}

	@Test
	void getGreeting()
	{
		System.out.println(controller.getGreeting());
	}
}