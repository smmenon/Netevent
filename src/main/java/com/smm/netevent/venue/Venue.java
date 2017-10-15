package com.smm.netevent.venue;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.smm.netevent.event.Event;

@Entity
public class Venue {
	
	@Id
	private String venueId;	
	private String venueName;
	private String venueDesc;
	
	@ManyToOne
	private Event event;
	
	public Venue() {
		
	}

	public Venue(String venueId, String venueName, String venueDesc, String eventId) {
		super();
		this.venueId = venueId;
		this.venueName = venueName;
		this.venueDesc = venueDesc;
		this.event = new Event(eventId,"","");
	}
	
	public String getVenueId() {
		return venueId;
	}
	public void setVenueId(String venueId) {
		this.venueId = venueId;
	}
	public String getVenueName() {
		return venueName;
	}
	public void setVenueName(String venueName) {
		this.venueName = venueName;
	}
	public String getVenueDesc() {
		return venueDesc;
	}
	public void setVenueDesc(String venueDesc) {
		this.venueDesc = venueDesc;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}
	
}
