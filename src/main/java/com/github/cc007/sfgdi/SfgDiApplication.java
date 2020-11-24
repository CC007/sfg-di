package com.github.cc007.sfgdi;

import com.github.cc007.sfgdi.controllers.ConstructorInjectedController;
import com.github.cc007.sfgdi.controllers.MyController;
import com.github.cc007.sfgdi.controllers.PropertyInjectedController;
import com.github.cc007.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication
{

	public static void main(String[] args)
	{

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = ctx.getBean("myController", MyController.class);
		System.out.println("----- Primary Bean");
		System.out.println(myController.sayHello());

		System.out.println("----- Property");
		PropertyInjectedController propertyInjectedController = ctx.getBean("propertyInjectedController", PropertyInjectedController.class);
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("----- Setter");
		SetterInjectedController setterInjectedController = ctx.getBean("setterInjectedController", SetterInjectedController.class);
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("----- Constructor");
		ConstructorInjectedController constructorInjectedController = ctx.getBean("constructorInjectedController", ConstructorInjectedController.class);
		System.out.println(constructorInjectedController.getGreeting());
	}

}
