package az.developia.springpractise.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import az.developia.springpractise.beans.Computer;
import az.developia.springpractise.beans.Ram;

@Configuration
public class MyConfig {
	
@Bean
	public Computer myComputer() {
		Computer comp=new Computer();
		comp.model="G62";
		return comp;
	}


}
