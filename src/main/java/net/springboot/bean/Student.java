package net.springboot.bean;

public class Student {
	private int id;
	private String  firstName;
	private String lastName;
	
	
	public Student(int id, String firstName, String lastName) {
		this.id =id;
	    this.firstName = firstName;
	    this.lastName = lastName;
	    
		
	}
	 public Student() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		 return id;
		 
	 } 
	 public void setId(int id) {
		 this.id =id;
		 
	 }
	 public String firstName() {
		 return firstName;
		 
	 }
	public void setfirstName (String firstName) {
		this.firstName = firstName;
		
	}
	public String lastName() {
		return lastName;
		
	}
	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

}
