package rosarioscilipoti.u2w1d1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import rosarioscilipoti.u2w1d1.entites.Menu;

@SpringBootApplication
public class U2w1d1Application {

	public static void main(String[] args) {
		SpringApplication.run(U2w1d1Application.class, args);
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U2w1d1Application.class);
		Menu menu =  ctx.getBean(Menu.class);
		menu.printMenu();
		ctx.close();

	}




}
