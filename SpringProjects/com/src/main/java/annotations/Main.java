package annotations;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConfigurableApplicationContext ctx=new AnnotationConfigApplicationContext(Main.class);
		
		ChatService cs=ctx.getBean(ChatService.class);
		
		cs.chat();
		ctx.close();
	}

}
