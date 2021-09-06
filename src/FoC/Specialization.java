package FoC;

import java.util.HashMap;

public class Specialization {

	//create hashMap to store studentID and specialization
	HashMap<String, Double> hMap = new HashMap<>();
		
		
	public void addSpecialization(String Special, double Gpa) {
		//store student id and specialization
		hMap.put(Special, Gpa);
	}
	
}
