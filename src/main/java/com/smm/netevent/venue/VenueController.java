package com.smm.netevent.venue;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.smm.netevent.event.Event;

@RestController
public class VenueController {
	
	@Autowired
	private VenueService venueService;
		
	@RequestMapping("/events/{eventId}/venues")
	public List<Venue> getAllVenues(@PathVariable String eventId){
		return venueService.getAllVenues(eventId);
	}
	
	@RequestMapping("/events/{eventId}/venues/{venueId}")
	public Venue getVenue(@PathVariable String venueId){
		return venueService.getVenue(venueId);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/events/{eventId}/venues")
	public void addVenue(@RequestBody Venue venue, @PathVariable String eventId){
		venue.setEvent(new Event(eventId,"",""));
		venueService.addVenue(venue);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/events/{eventId}/venues/{venueId}")
	public void updateVenue(@RequestBody Venue venue, @PathVariable String eventId, @PathVariable String venueId){
		venue.setEvent(new Event(eventId,"",""));
		venueService.updateVenue(venue);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/events/{eventId}/venues/{venueId}")
	public void deleteVenue(@PathVariable String venueId){
		venueService.deleteVenue(venueId);
	}
}
