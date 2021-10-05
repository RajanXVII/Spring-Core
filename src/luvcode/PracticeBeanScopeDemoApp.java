package luvcode;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class PracticeBeanScopeDemoApp {

	public static void main(String[] args) throws SQLException {

		// load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
				
		
		  // retrieve bean from spring container Coach theCoach =
		  //context.getBean("myGolfCoach", Coach.class);
		  
		  Coach alphaCoach = context.getBean("myGolfCoach", Coach.class);
		  
		  
		  
		  // check if they are the same boolean result = (theCoach == alphaCoach);
		  
		  // print out the results System.out.println("\nPointing to the same object: "+ result);
		  
		 // System.out.println("\nMemory location for theCoach: " + theCoach);
		  
		  System.out.println("\nMemory location for alphaCoach: " + alphaCoach + "\n");
		  
		  // close the context
		 
		
		
	}

}








