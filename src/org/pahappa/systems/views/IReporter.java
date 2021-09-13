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
		theft2.setComment("This was the second incident");

		IncidentServiceImpl incidentHelper = new IncidentServiceImpl();

		try {
			System.out.println("=======Saving theft and theft1======");
			System.out.println(incidentHelper.saveIncident(theft));
			System.out.println(incidentHelper.saveIncident(theft1));
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("========Updating the object with a similar title=========");
		System.out.println(incidentHelper.updateIncident(theft2));

		//Testing getRedflagIncidents
		System.out.println("===========Testing RedFlag Incidents==================");
		System.out.println(incidentHelper.getRedflagIncidents());

		IncidentServiceImpl incidentCollection = new IncidentServiceImpl();

		System.out.println(incidentCollection.getAllIncidents());
	

	}
	
}
