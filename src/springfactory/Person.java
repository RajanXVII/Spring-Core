package springfactory;

public class Person implements Species {
private int age;
private String name;
Alien alienObj;

@Override
public int getAge() {
	return age;
}
@Override
public void setAge(int age) {
	this.age = age;
}
@Override
public String getName() {
	return name;
}
@Override
public void setName(String name) {
	this.name = name;
}
public void setPersonspecie(Alien alien){
	this.alienObj=alien;
}
@Override
public String getDetails() {
	return getName()+ age;
}

public Person(Alien alien) {
	this.alienObj=alien;
}
public Person() {
	System.out.println("default constructor");
}
@Override
public String getAlienfromPerson() {
	return this.alienObj.getName()+"name:"+this.name+"age:"+this.age;
}
}
