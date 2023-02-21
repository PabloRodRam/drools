package javaclases;

import java.util.ArrayList;
import java.util.List;

public class desease {
	String name;
	List<Symptoms> symptoms=new ArrayList<Symptoms>();

	public desease(String name, ArrayList<Symptoms> symptoms) {
		super();
		this.name = name;
		this.symptoms = symptoms;
	}

	public desease() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Symptoms> getSymptoms() {
		return (ArrayList<Symptoms>) symptoms;
	}

	public void setSymptoms(ArrayList<Symptoms> symptoms) {
		this.symptoms = symptoms;
	}

}
