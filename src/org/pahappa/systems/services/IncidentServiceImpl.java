package org.pahappa.systems.services;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.pahappa.systems.enums.Status;
import org.pahappa.systems.exceptions.SavingFailedException;
import org.pahappa.systems.exceptions.ValidationFailedException;
import org.pahappa.systems.models.Incident;

public class IncidentServiceImpl implements IncidentService {

	private  static ArrayList<Incident> incidents = new ArrayList<Incident>();
	private static int incidentIds=0;

	@Override
	public Incident saveIncident(Incident incident) throws Exception {


		if (incident.getTitle()==null){
			throw new ValidationFailedException("Please enter title");
		}
		if (incident.getTitle().isEmpty()){
			throw new ValidationFailedException("Please enter the title");
		}
		if (incident.getComment()==null){
			throw new ValidationFailedException("Please enter comment");
		}
		if (incident.getComment().isEmpty()){
			throw new ValidationFailedException("please enter comment.");
		}




		incident.setId(++incidentIds);
		incident.setStatus(Status.DRAFT);
		incident.setCreatedOn( new Date());
		incidents.add(incident);

		return incident;

	}

	@Override
	public Incident updateIncident(Incident incident) throws Exception {
		//Check if both the comment and title sections have been filled
		if (incident.getTitle().isEmpty()){
			throw new ValidationFailedException("Please enter title");
		}else if (incident.getTitle()==null){
			throw new ValidationFailedException("Please enter title");
		}else if (incident.getComment().isEmpty()){
			throw new ValidationFailedException("Please enter comment");
		}else if (incident.getComment()==null){
			throw new ValidationFailedException("Please enter comment");
		}

		//Searching and updating the incident
		Incident searchResult = findIncident(incident);
		if (searchResult == null){
			throw new ValidationFailedException("This record does not exist");
		}else {
			searchResult.setTitle(incident.getTitle());
			searchResult.setComment(incident.getComment());
			return searchResult;
		}

		//return null;
	}

	public Incident findIncident(Incident incident) throws Exception {
		for(Incident item: incidents){
			if(item.getTitle().contains(incident.getTitle())){
				return  item;
			}
		}
		return null;
	}

	@Override
	public List<Incident> getAllIncidents() {
		// TODO Auto-generated method stub
		return incidents;
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
		for(Incident incident:incidents){
			if(incident.getId() == id){
				return incident;
			}
		}
		return null;
	}

	@Override
	public void deleteIncident(Incident incident) {
		
	}


}
