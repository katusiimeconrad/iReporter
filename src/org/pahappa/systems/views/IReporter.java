package org.pahappa.systems.views;
import org.pahappa.systems.services.IncidentServiceImpl;

import org.pahappa.systems.enums.Type;
import org.pahappa.systems.exceptions.SavingFailedException;
import org.pahappa.systems.models.Incident;
import org.pahappa.systems.services.IncidentServiceImpl;

import java.util.List;
import java.util.Scanner;

public class IReporter {

	public void printIncidents(List<Incident> incidents){
		System.out.println("======== All Incidents =======");
		int counter = 0;
		Incident in = new Incident();
		for(Incident item:incidents){
			in.setCounter(++counter);
			System.out.println(in.getCounter()+". "+item);
		}
	}

	public void printIncidents(List<Incident> incidents, String type){
		System.out.println("======== "+ type +" =======");
		int counter = 0;
		Incident in = new Incident();
		for(Incident item:incidents){
			in.setCounter(++counter);
			System.out.println(in.getCounter()+". "+item);
		}
	}
	
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
					Incident incident1 = new Incident();
					System.out.println("Please select(Number) the type of your incident \n" +
							"1 ---> corruption Incident \n" +
							"2 ---> Intervention Incident" + "\n");
					int type = sc.nextInt();

					System.out.println("Please enter the title of your incident \n");
					sc.nextLine();
					String title = sc.nextLine();
					System.out.println("Enter your comment \n");
					String comment = sc.nextLine();

					if (type == 1){
						incident1.setType(Type.RED_FLAG);
					}
					if (type == 2){

						incident1.setType(Type.INTERVENTION);
					}
					incident1.setTitle(title);
					incident1.setComment(comment);

					Incident savedIncident = serviceHelper.saveIncident(incident1);
					System.out.println("Your report has been saved" + "\n");
					System.out.println(savedIncident);

					break;
				case 3:
					System.out.println("hello collins");
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
