package az.developia.springpractise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import az.developia.springpractise.service.GreetingService;

@Controller
public class PropertertyInjectionController {
	@Autowired
	public GreetingService greetingService;
	
	public String getGreeting() {
		return greetingService.sayGreeting();	
	}

}
