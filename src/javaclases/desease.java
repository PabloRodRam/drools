package javaclases;

import java.util.ArrayList;
import java.util.List;

public class desease {
	String name;
	List<Syntomps> symptoms=new ArrayList<Syntomps>();

	public desease(String name, ArrayList<Syntomps> symptoms) {
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

	public ArrayList<Syntomps> getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(ArrayList<Syntomps> symptoms) {
		this.symptoms = symptoms;
	}

}
