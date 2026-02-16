package in.scalive.runner;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.scalive.model.Student;
import in.scalive.service.StudentService;

@Component
public class MyCommandlineRunner implements  CommandLineRunner{

	@Autowired
	private StudentService serv;
	@Override
	public void run(String... args) throws Exception {
		
		Student s = new Student();
		
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
		
		
		System.out.print("Any more (yes/no) ");
		choice = kb.next();
		}while(choice.equalsIgnoreCase("yes"));
		
		List<Student> stList = serv.getAllStudents();
		for(Student st : stList) {
			System.out.println("roll : "+st.getRoll() +", name : "+st.getName()+", per : "+st.getPer());
		}
		
	}

}
