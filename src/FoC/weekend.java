package FoC;

public class weekend extends Student {
	private String jobTitle;
	
	
	//default constructor
	public weekend() {
		super();
		jobTitle = "";
	}
	
	
	//addDeatils method for weekend student
	public void addDetails(String name, String address, char sex, int bornYear, String specialization,
			String jobTitle) {
		super.addDetails(name, address, sex, bornYear, specialization);
		this.jobTitle = jobTitle;
	}
	
	
	//Assign 5 marks of weekend student
	public void addMark (int m1, int m2, int m3, int m4, int m5) {
		super.addMark(m1, m2, m3, m4, m5);
	}
	
	
	//show weekend student details
	public void showDetails() {
		super.showDetails();
		System.out.println("Student Job title "+ jobTitle);
	}




}
