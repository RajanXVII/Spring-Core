package noxml;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;


public class Elon implements Species,DisposableBean{
	@Override
	public String print() {
		// TODO Auto-generated method stub
		return "printed from elon";
		
	}

	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setAge(int i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
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
	public void destroy() {
		System.out.println("destruction of elon");
	}
}
