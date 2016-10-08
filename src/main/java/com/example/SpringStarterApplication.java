package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
// @EnableWebMvc
@Configuration
// @ComponentScan
// @EnableAutoConfiguration
public class SpringStarterApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringStarterApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringStarterApplication.class, args);
	}

	// @Bean
	// public FilterRegistrationBean shallowEtagHeaderFilter() {
	// FilterRegistrationBean registration = new FilterRegistrationBean();
	// registration.setFilter((Filter) new LoggingResponseFilter());
	// registration.setDispatcherTypes(EnumSet.allOf(DispatcherType.class));
	// registration.addUrlPatterns("*");
	// return registration;
	// }

	// @Bean
	// public LoggingResponseFilter simpleFilter() {
	// return new LoggingResponseFilter();
	// }

}

@RestController
class GreetingController {

	@RequestMapping("/hello/{name}")
	String hello(@PathVariable String name) {
		return "Hello, " + name + "!";
	}
}