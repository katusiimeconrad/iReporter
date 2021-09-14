package org.pahappa.systems.views;
import org.pahappa.systems.services.IncidentServiceImpl;

import org.pahappa.systems.enums.Type;
import org.pahappa.systems.exceptions.SavingFailedException;
import org.pahappa.systems.models.Incident;
import org.pahappa.systems.services.IncidentServiceImpl;

import java.util.Scanner;

public class IReporter {
	
	public static void main(String[] args) throws Exception {
		IncidentServiceImpl serviceHelper =new IncidentServiceImpl();
		System.out.println("**WELCOME TO IREPORTER SYSTEM**\n" +
				"DESCRIPTION OF IREPORTER \n" +
				"Corruption is a huge bane to Africa’s development.\n" +
				"African countries must develop novel and localised solutions that will curb this menace, hence the birth of iReporter.\n" +
				"iReporter enables any/every citizen to bring any form of corruption to the notice of appropriate authorities and the general public.\n" +
				"Users can also report on things that needs government intervention...........\n" +
				"*****************************************************\n" +
				"WHAT WOULD YOU LIKE TO DO {SELECT AN OPTION}.\n");
         boolean i =true;
		while (i){
			System.out.println("1. Get Incidents\n" +
					"2. Save Incidents\n" +
					"3. Update Incidents\n" +
					"4. Delete Incidents\n" +
					"5. Total number of incidents\n" +
					"0. Exit\n" +
					"Enter your option:\n" +
					" ");
			Scanner sc = new Scanner(System.in);
			int option;
			option =sc.nextInt();
			switch (option){
				case 1:
					boolean x = true;
					while(x) {
						System.out.println(
								"Select an option:\n" +
										"1. Get Red Flag Incidents\n" +
										"2. Get Intervention Incidents\n" +
										"3. View All Incidents\n" +
										"0. Exit\n"
						);
						Scanner scanner = new Scanner(System.in);
						int incidentOption;
						incidentOption = scanner.nextInt();
						switch (incidentOption) {
							case 1: System.out.println("Red Flag Incidents : \n" + serviceHelper.getRedflagIncidents());
							break;
							case 2: System.out.println("Intervention Incidents : \n" + serviceHelper.getInterventionIncidents());
							break;
							case 3: System.out.println("All Incidents : \n" + serviceHelper.getAllIncidents());
							break;
							case 0: x = false;
									System.out.println("Exiting ....");
							break;
							default:
								System.out.println("Invalid option");
						}
					}
					break;
				case 2:
					System.out.println("hello andrew");
					break;
				case 3:
					System.out.println("hello sherifa");
					break;
				case 4:
					System.out.println("hello katusiime kabogoza");
					break;
				case 5:
					System.out.println("Total  number of incidents "+serviceHelper.countIncidents());
					break;
				case 0:
					i=false;
					System.out.println("Exiting ...");
					break;
				default:
					System.out.println("wrong input");
			}
		}



	}
}
