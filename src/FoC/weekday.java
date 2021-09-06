package FoC;

public class weekday  extends Student {
	private String freeDay;

	//default constructor
	public weekday() {
		super();
		freeDay = "";
	}
	
	
	//addDetails method for weekday student
	public void addDetails(String name, String address, char sex, int bornYear, String specialization,
			String freeDay) {
		super.addDetails(name, address, sex, bornYear, specialization);
		this.freeDay = freeDay;
	}
	
	
	public void addMark (int m1, int m2, int m3, int m4, int m5) {
		super.addMark(m1, m2, m3, m4, m5);
	}
	
	
	public void showDetails() {
		super.showDetails();
		System.out.println("Student free day "+ freeDay);
		
	}
	
}
	