package springannot;



import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;
@Component
public class Alien implements Species,DisposableBean{
	
		private int age;
		private String name;
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
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public String getDetails() {
			// TODO Auto-generated method stub
			return "X "+getName()+getAge()+" X";
		}
		@Override
		public String getAlienfromPerson() {
			// TODO Auto-generated method stub
			return null;
		}
		public void initM() {
			System.out.println("Init method!!!");
		}
		public void destroyM() {
			System.out.println("Destroy method!!!");
		}
		@Override
		public void destroy() {
			System.out.println("DEstroy from disposable bean!!!!");
		}
		@Override
		public String print() {
			// TODO Auto-generated method stub
			return "printed from alien";
			
		}
		
		
}

	
