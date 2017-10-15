package com.smm.netevent.event;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {
	
	@Autowired
	private EventRepository eventRepo;
	
	public List<Event> getAllEvents() {
		List<Event> events = new ArrayList<>();
		eventRepo.findAll()
			.forEach(events::add);
		return events;
	}

	public Event getEvent(String eventId) {
		return eventRepo.findOne(eventId);
	}

	public void addEvent(Event event) {
		eventRepo.save(event);
	}

	public void updateEvent(Event event, String eventId) {
		eventRepo.save(event);
	}

	public void deleteEvent(String eventId) {
		eventRepo.delete(eventId);		
	}
}
