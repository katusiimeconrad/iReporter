package org.pahappa.systems.views;
import org.pahappa.systems.services.IncidentServiceImpl;

import org.pahappa.systems.enums.Type;
import org.pahappa.systems.exceptions.SavingFailedException;
import org.pahappa.systems.models.Incident;
import org.pahappa.systems.services.IncidentServiceImpl;

public class IReporter {
	
	public static void main(String[] args) {

		System.out.println("iReporter test");

		Incident theft = new Incident();
		theft.setTitle("Theft Of public funds");
		theft.setType(Type.RED_FLAG);
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
		
		IncidentServiceImpl incidentCollection = new IncidentServiceImpl();
		
		System.out.println(incidentCollection.getAllIncidents());

		//Testfor if incident exists
		System.out.println(incidentCollection.incidentExists(theft));
	
		//Testing count all incidents
		System.out.println(incidentHelper.countIncidents());
	}
}
