package az.developia.springpractise.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope(scopeName = "prototype")

public class Computer {

    public String model;

    public Ram ram;


    public Computer(Ram ram) {
        super();
        this.ram = ram;
    }


    public Computer() {
        model = "Inspire";
        System.out.println("Computer Created");
    }

}
