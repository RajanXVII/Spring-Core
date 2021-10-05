package springfactory;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotaionDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		ctx.getBean("personspieces", Species.class);
		ctx.close();
	}

}
