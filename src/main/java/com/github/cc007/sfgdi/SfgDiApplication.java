package com.github.cc007.sfgdi;

import com.github.cc007.sfgdi.controllers.MyController;
import com.github.cc007.sfgdi.examplebeans.FakeDataSource;
import com.github.cc007.sfgdi.examplebeans.FakeJmsBroker;
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

		FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUser());

		FakeJmsBroker fakeJmsBroker = ctx.getBean(FakeJmsBroker.class);

		System.out.println(fakeJmsBroker.getUser());
	}

}
