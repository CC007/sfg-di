package com.github.cc007.sfgdi.config;

import com.github.cc007.sfgdi.examplebeans.FakeDataSource;
import com.github.cc007.sfgdi.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:datasource.properties")
@PropertySource("classpath:jms.properties")
public class PropertyConfig
{
	@Autowired
	Environment environment;

	@Value("${guru.username}")
	String user;

	@Value("${guru.password}")
	String password;

	@Value("${guru.dburl}")
	String url;

	@Value("${guru.jms.username}")
	String jmsUser;

	@Value("${guru.jms.password}")
	String jmsPassword;

	@Value("${guru.jms.url}")
	String jmsUrl;

	@Bean
	public FakeDataSource fakeDataSource(){
		FakeDataSource fakeDataSource = new FakeDataSource();
		// or set the GURU_USERNAME env variable to set the guru.username value
		fakeDataSource.setUser(environment.getProperty("USERNAME"));
		fakeDataSource.setPassword(password);
		fakeDataSource.setUrl(url);
		return fakeDataSource;
	}

	@Bean
	public FakeJmsBroker fakeJmsBroker(){
		FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
		// or set the GURU_USERNAME env variable to set the guru.username value
		fakeJmsBroker.setUser(jmsUser);
		fakeJmsBroker.setPassword(jmsPassword);
		fakeJmsBroker.setUrl(jmsUrl);
		return fakeJmsBroker;
	}

	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
