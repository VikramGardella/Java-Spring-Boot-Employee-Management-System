package vehicle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import contexts.MyBeans;

public class Driver {

	public static void main(String[] args) {
	//	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
	//	FileSystemXmlApplicationContext ftx = new FileSystemXmlApplicationContext("\\\application-context.txt");
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyBeans.class);
		Car car = ctx.getBean("car", Car.class);
		car.start();
		car.drive();
		System.out.println(car.getMaxSpeed());
		ctx.close();
	}

}
