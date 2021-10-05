package noxml;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;


public class Person implements DisposableBean,Species{
	@Value("${foo.age}")
	private int age;
	@Value("${foo.name}")
	private String name;
	Alien alienObj;
//@Autowired
//@Qualifier("elon")
	Species specie;
	String personspecieAuto;

	public void setPersonspecie(Alien alien) {
		this.alienObj = alien;
	}

	public void setPersonspecieAuto(Species specie) {
		System.out.println("insided autowired method");
		this.specie = specie;
	}

	public String getPersonspecieAuto() {
		return specie.print();
	}

	
	  
	
	  public Person(Alien alien) {
	  this.alienObj=alien;System.out.println("previous constructor 1-args"); }
	 

		
	
	   public Person(Species specie) {
		  this.specie = specie; }
	 
		 

		
		  public Person() { System.out.println("default constructor"); }
		 
	@Override
	public void destroy() {
		System.out.println("destroyed bean");
	}
	
	public void initM() {
		System.out.println("initM bean");
	}
	
	public void destroyM() {
		System.out.println("destroyedM bean");
	}

	

	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return this.age;
	}

	@Override
	public void setAge(int i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public void setName(String s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getAlienfromPerson() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return this.specie.print();
	}

}
