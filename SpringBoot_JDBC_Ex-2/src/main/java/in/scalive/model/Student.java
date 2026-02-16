package in.scalive.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {

	private int roll;
	private String name ;
	private double per;
	
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPer() {
		return per;
	}
	public void setPer(double per) {
		this.per = per;
	}
	
	
}
