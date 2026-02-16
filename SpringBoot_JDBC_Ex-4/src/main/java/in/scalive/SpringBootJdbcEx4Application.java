package in.scalive;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.scalive.model.Student;
import in.scalive.service.StudentService;

@SpringBootApplication
public class SpringBootJdbcEx4Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringBootJdbcEx4Application.class, args);
		Student s = new Student();
		StudentService serv = container.getBean(StudentService.class);
		
		Scanner kb = new Scanner(System.in);
		
	
		System.out.print("Enter roll : ");
		int roll = kb.nextInt();
		
		System.out.print("Enter name : ");
		String name = kb.next();
		
		System.out.print("Enter per : ");
		double per = kb.nextDouble();
		
		s.setRoll(roll);
		s.setName(name);
		s.setPer(per);
		
		serv.save(s);
		
	}

}
