package springannot;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

public class Person implements DisposableBean{
	private int age;
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

	
	  
	/*
	 * public Person(Alien alien) {
	 * this.alienObj=alien;System.out.println("previous constructor 1-args"); }
	 */

		
	
	  @Autowired public Person(@Qualifier("elon") Species specie) { this.specie =
	  specie; }
	 
		 

		
		  public Person() { System.out.println("default constructor"); }
		 
	@Override
	public void destroy() {
		System.out.println("destroyed bean");
	}
	@PostConstruct
	public void initM() {
		System.out.println("initM bean");
	}
	@PreDestroy
	public void destroyM() {
		System.out.println("destroyedM bean");
	}

}
