package noxml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotaionDemo {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx =new AnnotationConfigApplicationContext(SpringEmpty.class);
		Species sp=(ctx.getBean( "person",Species.class));
		//System.out.println(sp.getPersonspecieAuto());
		//Person sp2=ctx.getBean( Person.class);
		//System.out.println(sp==sp2);
		//Person sp=new SpringEmpty().getPerson();
		//sp.initM();
		//Person sp2=(ctx.getBean( "person123",Person.class));
		System.out.println(sp.getAge()+sp.getName());
		System.out.println(sp.print());
		ctx.close();
	}

}
