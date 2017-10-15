package com.smm.netevent.venue;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VenueService {
	
	@Autowired
	private VenueRepository venueRepo;
	
	public List<Venue> getAllVenues(String eventId) {
		List<Venue> venues = new ArrayList<>();
		venueRepo.findByEventEventId(eventId)
			.forEach(venues::add);
		return venues;
	}

	public Venue getVenue(String venueId) {
		return venueRepo.findOne(venueId);
	}

	public void addVenue(Venue venue) {
		venueRepo.save(venue);
	}

	public void updateVenue(Venue venue) {
		venueRepo.save(venue);
	}

	public void deleteVenue(String venueId) {
		venueRepo.delete(venueId);		
	}
}
