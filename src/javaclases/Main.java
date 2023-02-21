package javaclases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


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
        
		  try {
              BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));
              text = consola.readLine();
              number = Integer.parseInt(text);
         

		do {
			
			System.out.println("Hello, write the number of the symptom or symptoms that you suffer: ");
			System.out.println("  0. Shortness of breath"+"/n"
								+"1. Rapid breathing"+"/n"
								+"2.Wheezing"+"/n"
								+"3.Cyanosis"+"/n"
								+"4.Headache"+"/n");
			
			
			}while (true);

		  } catch (IOException ioe) {
              System.out.println("Error in keyboard reading. Please enter an input again.");
		  }//catch
}
}