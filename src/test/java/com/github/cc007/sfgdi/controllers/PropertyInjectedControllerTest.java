package com.github.cc007.sfgdi.controllers;

import com.github.cc007.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest
{
	PropertyInjectedController controller;

	@BeforeEach
	void setup(){
		controller = new PropertyInjectedController();

		controller.greetingService = new GreetingServiceImpl();
	}
	@Test
	void getGreeting(){
		System.out.println(controller.getGreeting());
	}
}