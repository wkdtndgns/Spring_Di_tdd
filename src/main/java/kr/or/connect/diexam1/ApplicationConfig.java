package kr.or.connect.diexam1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration					// jdk 5부터 사용가능 
public class ApplicationConfig {

	@Bean 
	public Car car(Engine e ) { 
		Car c = new Car(); 
		c.setEngine(e);
		return c;
	}
	
	@Bean 
	public Engine engine() {
		return new Engine();
	}
	
	
	
	
}
