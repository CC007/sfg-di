package com.github.cc007.sfgdi;

import com.github.cc007.sfgdi.controllers.MyController;
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

		String greeting = myController.sayHello();
		System.out.println(greeting);
	}

}
