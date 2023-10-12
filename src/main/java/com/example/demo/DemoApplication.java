package com.example.demo;

import com.example.demo.controller.FlightController;
import com.example.demo.service.FlightService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DemoApplication.class);

	}
	/**
	 * Spring beans allow for a few advantages
	 * 1) easy configuration of important classes.
	 * 		a) our server and database connections are beans that we can manipulate, configure easily.
	 * 		b) spring is 'opinionated', so it will follow defaults for the purpose of instantiating object.
	 * 		c) spring allows for 'convention over configuration', spring can read the names of classes/objects
	 * 			and know to use/configure them in a certain way.
	 * 		d) objects can be easily configured to follow certain patterns, such as scoping - spring
	 * 			can manage singleton design patterns for us, make a object exist for the lifetime of a
	 * 			web request or session, etc
	 * 		e) beans allow for 'loose coupling' - if we have multiple implementations of the same functionality,
	 * 			spring can autowire in the more appropriate implementation.
	 *
	 *  we're skipping straight to spring boot, because realistically everyone is using spring boot now,
	 *  and you can't even find good resources on how to configure spring without boot nowadays.
	 *  	a) spring boot auto-configures certain beans. (web/database related beans.)
	 *  	b) spring boot performs a component scan of our application, so, it will search our entire app
	 *  		for classes marked with @component so that it knows to treat them as beans.
	 *
	 *  We are NOT using .xml configuration for beans. We ARE using annotation config for beans.
	 *  	If you find a spring tutorial or debugging guide that uses .xml config instead of annotations,
	 *  	ignore it and move on. Everyone uses annotations nowadays.
	 *
	 *  IOC - inversion of control - spring manages our objects instead of the developer instantiating /
	 *  configuring them
	 *
	 *  ApplicationContext is the object provided by Spring which is the representation of the
	 *  IOC container - it is where all of your beans are stored and may be retrieved from
	 */

}
