package az.developia.springpractise.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Ram {
public int size;
public String brand;
public Ram() {
	size=8;
	brand="Rambrand";
	System.out.println("Ram yarandi ");
}
}
