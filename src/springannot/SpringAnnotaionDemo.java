package springannot;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotaionDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx =new ClassPathXmlApplicationContext("applicationContextannot.xml");
		Species sp=ctx.getBean("person123", Species.class);
		List ls=new ArrayList<>();//downlcasting
		 ArrayList ar=new ArrayList();
		 
		
		
		//System.out.println(sp.getPersonspecieAuto());
		//Person sp2=ctx.getBean("person123", Person.class);
		//System.out.println(sp==sp2);
		ctx.close();
	}

}
