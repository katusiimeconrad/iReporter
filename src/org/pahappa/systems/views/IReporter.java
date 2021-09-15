package org.pahappa.systems.views;
import org.pahappa.systems.services.IncidentServiceImpl;

import org.pahappa.systems.enums.Type;
import org.pahappa.systems.exceptions.SavingFailedException;
import org.pahappa.systems.models.Incident;
import org.pahappa.systems.services.IncidentServiceImpl;

import java.util.List;
import java.util.Scanner;

public class IReporter {

	public static void printIncidents(List<Incident> incidents){
		System.out.println("======== All Incidents =======");
		int counter = 0;
		Incident in = new Incident();
		for(Incident item:incidents){
			in.setCounter(++counter);
			System.out.println(in.getCounter()+". "+item);
		}
	}

	public static void printIncidents(List<Incident> incidents, String type){
		System.out.println("======== "+ type +" =======");
		int counter = 0;
		Incident in = new Incident();
		for(Incident item:incidents){
			in.setCounter(++counter);
			System.out.println(in.getCounter()+". "+item);
		}
	}
	
	public static void main(String[] args) throws Exception {
		IncidentServiceImpl servicehelper =new IncidentServiceImpl();
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
					System.out.println("hello ben");
					break;
				case 2:
					System.out.println("hello andrew");
					break;
				case 3:
					Incident incident1 = new Incident();
					System.out.println("===== Please Choose the number of the incident to edit =====");
					printIncidents(servicehelper.getAllIncidents());
					int chosen = sc.nextInt();
					sc.nextLine();
					for(Incident item: servicehelper.getAllIncidents()){
						if(item.getCounter() == chosen){
							System.out.println("Enter the new Title: ");
							incident1.setTitle(sc.nextLine());
							System.out.println("Choose 1 for Corruption Incident or 2 for Intervention incident");
							int type = sc.nextInt();
							if(type == 1){
								incident1.setType(Type.RED_FLAG);
							}else if(type == 2){
								incident1.setType(Type.INTERVENTION);
							}
							System.out.println("Enter the new Comment");
							incident1.setComment(sc.nextLine());
							System.out.println(servicehelper.updateIncident(incident1));
						}
					}
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
