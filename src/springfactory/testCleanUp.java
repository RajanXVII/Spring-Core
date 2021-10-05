package springfactory;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testCleanUp {
	public static void main(String[] args) {
	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContextcleanup.xml");
	ctx.getBean("alienspieces", Alien.class);
	ctx.close();
	}
}
