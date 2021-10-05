package springfactory;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springcontainer {

	public static void main(String[] args) {
		//Load the Spring Configuration file.
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrive Bean from Spring container
		Species speciesobj=context.getBean("alienspieces", Species.class);
		
		//call Methods on Bean
		speciesobj.setAge(1025);
		speciesobj.setName("AndroidRajan");
		System.out.println(speciesobj.getDetails());
		speciesobj=context.getBean("personspieces", Species.class);
		/*
		 * speciesobj.setAge(25); speciesobj.setName("Rajan");
		 */
		System.out.println("Setter injection-->"+speciesobj.getAlienfromPerson());
		
		//Implemeting constructor dependency injection.
		System.out.println("This is constuctor dependency injection-->"+speciesobj.getAlienfromPerson());
		
		//close the context
		context.close();
	
		
	}

}
