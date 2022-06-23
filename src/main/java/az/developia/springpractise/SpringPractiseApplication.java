package az.developia.springpractise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import az.developia.springpractise.beans.Computer;
import az.developia.springpractise.beans.Ram;
import az.developia.springpractise.config.MyConfig;
import az.developia.springpractise.controller.HelloWithController;
import az.developia.springpractise.controller.MyController;
import az.developia.springpractise.controller.PropertertyInjectionController;
import az.developia.springpractise.model.Student;
import org.springframework.security.core.parameters.P;

@SpringBootApplication
public class SpringPractiseApplication {

    public static void main(String[] args) {
 SpringApplication.run(SpringPractiseApplication.class, args);
//        Student s = context.getBean(Student.class);
//        System.out.println(s.name);
//        Computer c = context.getBean(Computer.class);
//        System.out.println(c.model);
//        Ram ram = context.getBean(Ram.class);
//        System.out.println(ram.brand);
//        Ram ram2 = context.getBean(Ram.class);
//        System.out.println(ram2.brand);

   

    }
}