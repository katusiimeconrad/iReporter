package org.pahappa.systems.services;
import java.util.ArrayList;
import java.util.List;

import org.pahappa.systems.models.Incident;
import org.pahappa.systems.models.Type;

public class IncidentServiceImpl implements IncidentService {

	@Override
	public Incident saveIncident(Incident incident) throws Exception {
		// TODO Auto-generated method stub
		return null;
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
		//[redflagIncidents] will contain all incidents in [incidents] where type is REDFLAG
		List<Incident> redflagIncidents = new ArrayList<Incident>();
		for (Incident incident:incidents) {
			if( incident.getType() == Type.REDFLAG ){
				redflagIncidents.add(incident);
			}
		}
		//The List will be empty if no incidents were marked as REDFLAG
		return redflagIncidents;
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
