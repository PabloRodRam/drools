package javaclases;

import java.util.ArrayList;
import java.util.List;

public class Disease {
	
	String name;
	List<Symptoms> symptoms; //=new ArrayList<Symptoms>();

	public Disease(String name, ArrayList<Symptoms> symptoms) {
		this.name = name;
		this.symptoms = new ArrayList<Symptoms>();
	}

	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public List<Symptoms> getSymptoms() {
		return symptoms;
	}



	public void setSymptoms(List<Symptoms> symptoms) {
		this.symptoms = symptoms;
	}



	//public Disease() {
	//	super();
	//}

	

}
