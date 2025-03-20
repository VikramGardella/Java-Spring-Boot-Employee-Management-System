package contexts;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import vehicle.Car;
import vehicle.ElectricMotor;

@Configuration
public class MyBeans {
	@Bean
	public Car car() {
		return new Car(em(), new Integer(150));
	}
	
	@Bean
	public ElectricMotor em() {
		return new ElectricMotor();
	}
	
	
}


