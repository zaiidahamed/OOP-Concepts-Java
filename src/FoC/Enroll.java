package FoC;

import java.util.HashMap;
import java.util.Map;

public class Enroll {
	
	//create hashMap to store studentID and specialization
	HashMap<String, String> stdMap = new HashMap<>();
	
	
	public void enrollStudent(String stdID, String specialz) {
		//store student id and specialization
		stdMap.put(stdID, specialz);

	}
	
	//Display student ID and specialization
	public void displayEnrolledStudents() {
		for (Map.Entry<String, String> val : stdMap.entrySet()) {	//convert HashMap into EntrySet
			System.out.println(val.getKey()+" : "+ val.getValue());
		}
		
	}
}
