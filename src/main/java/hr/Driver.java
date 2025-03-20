package hr;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import contexts.MyBeans;
import vehicle.Car;

public class Driver {

	public static void main(String[] args) {
	/*	JdbcTemplate jdbcTemplate;
		EmployeeService es = new EmployeeService();
		System.out.println(es.getJdbcTemplate());
		es.addEmployee(new Employee(5, "fifer", "fivington", 55555));*/
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
		//	FileSystemXmlApplicationContext ftx = new FileSystemXmlApplicationContext("\\\application-context.txt");
		//	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyBeans.class);
		EmployeeService es = ctx.getBean("es", EmployeeService.class);
		Employee test = new Employee(5, "fifer", "fivington", 55555);
		es.addEmployee(test);
		System.out.println(es);
		ctx.close();

		
		
	}

}
