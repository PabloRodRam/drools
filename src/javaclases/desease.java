package javaclases;

import java.util.ArrayList;

public class desease {
	String name;
	ArrayList<sympthomps> symptoms;

	public desease(String name, ArrayList<sympthomps> symptoms) {
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

	public ArrayList<sympthomps> getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(ArrayList<sympthomps> symptoms) {
		this.symptoms = symptoms;
	}

}
