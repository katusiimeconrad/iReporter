package org.pahappa.systems.views;
import org.pahappa.systems.services.IncidentServiceImpl;

import org.pahappa.systems.enums.Type;
import org.pahappa.systems.exceptions.SavingFailedException;
import org.pahappa.systems.models.Incident;
import org.pahappa.systems.services.IncidentServiceImpl;

import java.util.Scanner;

public class IReporter {
	
	public static void main(String[] args) throws Exception {
		IncidentServiceImpl servicehelper =new IncidentServiceImpl();
		Incident incident1 = new Incident();
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
			System.out.println("1.get all incidents{view reports}\n" +
					"2.save icidents.\n" +
					"3.update incidemts.\n" +
					"4.delete incidents{delete}\n" +
					"5.total number of incidents{count}\n" +
					"0. exit\n" +
					"enter ur option:\n" +
					" ");
			Scanner sc = new Scanner(System.in);
			int option;
			option =sc.nextInt();
			switch (option){
				case 1:
					System.out.println("Please select(Number) the type of your incident \n" +
							"1 ---> corruption Incident \n" +
							"2 ---> Intervention Incident" + "\n");
					int type = sc.nextInt();

					System.out.println("Please enter the title of your incident \n");
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

					Incident savedIncident = servicehelper.saveIncident(incident1);
					System.out.println("Your report has been saved" + "\n");
					System.out.println(savedIncident);

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
					System.out.println("total  number of incidents "+servicehelper.countIncidents());
					break;
				case 0:
					i=false;
					break;
				default:
					System.out.println("wrong input");
			}
		}



	}
}
