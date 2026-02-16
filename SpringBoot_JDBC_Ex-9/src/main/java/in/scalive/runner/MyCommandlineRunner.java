package in.scalive.runner;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


import in.scalive.service.StudentService;

@Component
public class MyCommandlineRunner implements  CommandLineRunner{

	@Autowired
	private StudentService serv;
	@Override
	public void run(String... args) throws Exception {
		
		
		serv.save();
		
		
		
		
	}

}
