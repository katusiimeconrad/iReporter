package org.pahappa.systems.views;

import org.pahappa.systems.exceptions.SavingFailedException;
import org.pahappa.systems.models.Incident;
import org.pahappa.systems.models.Type;
import org.pahappa.systems.services.IncidentServiceImpl;

public class IReporter {
	
	public static void main(String[] args) {
		System.out.println("iReporter test");










		Incident theft = new Incident();
		theft.setTitle("Theft Of public funds");
		theft.setType(Type.REDFLAG);
		theft.setComment("Mr. Someone Embezzled funds meant for constructing a certain road");

		IncidentServiceImpl incidentHelper = new IncidentServiceImpl();


		try {
			incidentHelper.saveIncident(theft);
		} catch (Exception e) {
			e.printStackTrace();
		}


		//Testing getRedflagIncidents
		System.out.println("===========Testing RedFlag Incidents==================");
		System.out.println(incidentHelper.getRedflagIncidents());
	}
	
}
