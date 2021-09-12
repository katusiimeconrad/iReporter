package org.pahappa.systems.views;
import org.pahappa.systems.services.IncidentServiceImpl;

public class IReporter {
	
	public static void main(String[] args) {
		
		IncidentServiceImpl incidentCollection = new IncidentServiceImpl();
		
		System.out.println(incidentCollection.getAllIncidents());
	
	}
	
}
