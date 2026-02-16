package in.scalive;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.scalive.model.Student;
import in.scalive.service.StudentService;

@SpringBootApplication
public class SpringBootJdbcEx1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringBootJdbcEx1Application.class, args);
		Student s = container.getBean(Student.class);
		StudentService serv = container.getBean(StudentService.class);
		
		Scanner kb = new Scanner(System.in);
		String choice;
		
		do {
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
		
		System.out.print("Any more ? ");
		choice = kb.next();
		
		}while(choice.equals("yes"));
		
		
		
		System.out.println("Total record inserted : "+serv.getCount());
		System.out.print("Enter roll to serch ");
		int roll = kb.nextInt();
		String name = serv.findById(roll);
		if(name == null) {
			System.out.println("No record found");
		}else {
			System.out.println("Name is : "+name);
		}
		
	}

}
