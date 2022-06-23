package az.developia.springpractise.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(path = "/salam")
public class HelloWithController {
		
	@GetMapping
	public String Hello() {
		return "Nadirr agilli ol";
	}
}
