package javaclases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	//List<String> symptoms= new ArrayList<String>();
	//symptoms=("Shortness_of_breath_or_difficulty_breathing", "Rapid_breathing_or_breathing_too_fast",
	//		"Wheezing", "Cyanosis", "Headache","Confusion_or_Disorientation", "Irregular_heartbeat", "Chest_pain",
	//		"Chest_pain_that_gets_worse_when_you_breathe_deeply_or_cough", "Fatigue_or_Weakness", "Dizzines",
	//		"Fainting_or_lost_of_consciousness"," Excessive_daytime_sleepiness", "Difficulty_concentrating",
	//		"Irritability", "Depression","Anxiety"," Restless_sleep"," Frequent_awakenings_at_night"," Insomia", 
			//		"Dry_mouth_or_sore_throat","Chest_oppression_or_and_discomfort"," Muscle_or_body_pain", "Cough", 
	//		"Cough_with_blood"," Cough_that_gets_worse_over_time","Difficulty_performing_physical_activities",
	//	"Loss_of_apetite_or_weight_loss", "Hoarseness", "Trouble_swallowing","Fever_or_chills",
			//		"Loss_of_taste_or_smell", "Congestion_or_running_nose", "Nausea_or_vomiting", "Diarrhea",
	//		"Inflammation_of_the_respiratory_tract", "Dyspnea", "Sweating", "Mucus", "Expectoration", 
	//		"Stridor", "Hypoxemia", "Tachycardia","Hypertemia", "Loss_of_negative_pressure", "Sneezing", 
	//		"Chronic_cough");
	
	
	
	
	public static void main(String[] args) throws Exception, IOException{
		
		String text = "";
        int number = 0;
        List<String> symptoms= new ArrayList<String>();
		  try {
              BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));
              text = consola.readLine();
              number = Integer.parseInt(text);
              System.out.println("Hello, write the number of the symptom or symptoms that you suffer: ");
  			  System.out.println("1. Shortness of breath"+"\n"
  								+"2. Rapid breathing"+"\n"
  								+"3. Wheezing"+"\n"
  								+"4. Cyanosis"+"\n"
  								+"5. Headache"+"\n");

		do {
			BufferedReader consola2 = new BufferedReader(new InputStreamReader(System.in));
            text = consola2.readLine();
            number = Integer.parseInt(text);
			switch(number){
			case 1: 
			symptoms.add("Shortness of breath");
			number = 0;
			System.out.println("add1 ");
			break;
			case 2: symptoms.add("Rapid breathing");
			number = 0;
			System.out.println("add2 ");
			break;
			case 3: symptoms.add("Wheezing");
			number = 0;
			System.out.println("add3 ");
			break;
			case 4: symptoms.add("Cyanosis");
			number = 0;
			System.out.println("add4 ");
			break;
			case 5: symptoms.add("Headache");
			number = 0;
			System.out.println("add5 ");
			break;
			case 6: System.out.println("This are yur symptoms: ");
					System.out.println(symptoms.toString());
					number = 6;
					break;
			}
			
			
			}while (number!=6);

		  } catch (IOException ioe) {
              System.out.println("Error in keyboard reading. Please enter an input again.");
		  }//catch
}
}