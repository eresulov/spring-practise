package az.developia.springpractise.controller;

import org.springframework.stereotype.Controller;

import az.developia.springpractise.service.GreetingService;

@Controller
public class SetterInjectionController {

	private GreetingService greetingService;

	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String getGreeting() {
		return greetingService.sayGreeting();	
	}
}