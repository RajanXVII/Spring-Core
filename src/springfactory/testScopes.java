package springfactory;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testScopes {
public static void main(String[] args) {
	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContextscope.xml");
	Species sp=ctx.getBean("alienspieces", Species.class);
	Species sp2=ctx.getBean("alienspieces", Species.class);
	if(sp==sp2)System.out.println("Singeton");
	else System.out.println("Prototype");
	
	ctx.close();
}
}
