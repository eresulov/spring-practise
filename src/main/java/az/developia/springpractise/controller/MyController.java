package az.developia.springpractise.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

	
	public String sayHello() {
		System.out.println("Hello dunya ");
		return "hello";
	}
}
