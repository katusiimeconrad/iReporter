package org.pahappa.systems.views;
import org.pahappa.systems.services.IncidentServiceImpl;

import org.pahappa.systems.enums.Type;
import org.pahappa.systems.exceptions.SavingFailedException;
import org.pahappa.systems.models.Incident;
import org.pahappa.systems.services.IncidentServiceImpl;

public class IReporter {
	
	public static void main(String[] args) throws Exception {

		System.out.println("iReporter test");

		Incident theft = new Incident();
		theft.setTitle("Theft Of public funds");
		theft.setType(Type.RED_FLAG);
		theft.setComment("Mr. Someone Embezzled funds meant for constructing a certain road");

		Incident theft1 = new Incident();
		theft1.setTitle("Theft of govt funds");
		theft1.setType(Type.RED_FLAG);
		theft1.setComment("The guy was nabbed");

		Incident theft2 = new Incident();
		theft2.setTitle("Theft of govt funds");
		theft2.setType(Type.RED_FLAG);
		theft2.setComment("The guy was nabbed");

		IncidentServiceImpl incidentHelper = new IncidentServiceImpl();

		try {
			System.out.println("=======Saving theft and theft1======");
			Incident saved = incidentHelper.saveIncident(theft);
			Incident saved1 = incidentHelper.saveIncident(theft1);
			System.out.println(saved);
			System.out.println(saved1);
			saved1.setTitle("Theft of local government funds.");
			System.out.println(incidentHelper.updateIncident(saved1));

		} catch (Exception e) {
			e.printStackTrace();
		}

		//Testing getRedflagIncidents
		System.out.println("===========Testing RedFlag Incidents==================");
		System.out.println(incidentHelper.getRedflagIncidents());

		IncidentServiceImpl incidentCollection = new IncidentServiceImpl();

		System.out.println(incidentCollection.getAllIncidents());

		//Testing count all incidents
		System.out.println(incidentHelper.countIncidents());
	}
}
