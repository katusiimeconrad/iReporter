package org.pahappa.systems.services;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.pahappa.systems.enums.Status;
import org.pahappa.systems.exceptions.SavingFailedException;
import org.pahappa.systems.models.Incident;

public class IncidentServiceImpl implements IncidentService {

	private  static ArrayList<Incident> incidents = new ArrayList<Incident>();
	private static int incidentIds=0;

	@Override
	public Incident saveIncident(Incident incident) throws Exception {


		if ((incident.getComment()!=null) & (incident.getTitle() != null)){
			incident.setId(++incidentIds);
			incident.setStatus(Status.DRAFT);
			incident.setCreatedOn( new Date());
			incidents.add(incident);


		}
		else {
			throw new SavingFailedException("Title/Comment was not provided");
		}
		return incident;

	}

	@Override
	public Incident updateIncident(Incident incident) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Incident> getAllIncidents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Incident> getRedflagIncidents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Incident> getInterventionIncidents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countIncidents() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean incidentExists(Incident incident) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Incident getIncidentOfId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteIncident(Incident incident) {
		// TODO Auto-generated method stub
		
	}

	
}
