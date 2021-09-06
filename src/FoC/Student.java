package FoC;

import java.util.Random;

abstract public class Student implements IStudent {
	protected String name;
	protected String address;
	protected char sex;
	protected int bornYear;
	protected String specialization;
	
	protected String stdID;	//student ID number
	
	protected int m1, m2, m3, m4, m5;
	
	
	//default constructor
	public Student() {
		name = "";
		address = "";
		sex = 'M';
		bornYear = 1900;
		specialization = "";
	}
	
	
	//addDetails method
	public void addDetails(String name, String address, char sex, int bornYear, String specialization) {
		this.name = name;
		this.address = address;
		this.sex = sex;
		this.bornYear = bornYear;
		this.specialization = specialization;
	}
	
	
	//Assign 5 marks of student
	public void addMark (int M1, int M2, int M3, int M4, int M5) {
		m1 = M1;
		m2 = M2;
		m3 = M3;
		m4 = M4;
		m5 = M5;
	}
	
	
	public String generateID() {
		IDgenaration();
		return stdID;
	}
	
	
	@Override
	public void IDgenaration() {
		try {
			String tempID; 	//store integer random value temporarily
			int no; 	//to store random values
			
			//create random value for student ID
			Random randm = new Random();
			no = randm.nextInt(100000);
			tempID = Integer.toString(no); //convert integer to String value
			stdID = ("IT" + tempID);
			
			if (stdID.length() < 4) {
				throw new IDInvalidException ("Student ID should be at least 4 digits");
			}
		
		}catch (IDInvalidException e) {
			System.out.println(e);
			IDgenaration();
		}
			//System.out.println("Student ID "+ stdID);
	}
	
	
	@Override
	public void showDetails() {
		System.out.println("Student name "+ name);
		System.out.println("Student address "+ address);
		System.out.println("Student gender "+ sex);
		System.out.println("Student year "+ bornYear);
		System.out.println("Student Specialization "+ specialization);
	}
	
}