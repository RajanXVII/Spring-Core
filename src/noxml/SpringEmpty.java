package noxml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
@Configuration
@ComponentScan("noxml")
@PropertySource("classpath:details.properties")
public class SpringEmpty {
	
	@Bean
	public Species alien() {
		System.out.println("Creating species");
		return new Alien();
	}	
@Bean
public Species person() {
	System.out.println("Creating person with alien");
	return new Person(alien());
}
@Bean
public Species person123() {
	System.out.println("Creating person");
	return new Person();
}
@Bean
public CustomLogging customLogging(@Value("${root.logger.level}") String rootlvel,@Value("${printed.logger.level}") String printlevel) {
	CustomLogging customLogging=new CustomLogging(rootlvel,printlevel);
	return customLogging;
}



}
