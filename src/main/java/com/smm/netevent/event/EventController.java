package com.smm.netevent.event;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {
	
	@Autowired
	private EventService eventService;
	
	@RequestMapping("/events")
	public List<Event> getAllEvents(){
		return eventService.getAllEvents();
	}
	
	@RequestMapping("/events/{eventId}")
	public Event getEvent(@PathVariable String eventId){
		return eventService.getEvent(eventId);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/events")
	public void addEvent(@RequestBody Event event){
		eventService.addEvent(event);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/events/{eventId}")
	public void updateEvent(@RequestBody Event event, @PathVariable String eventId){
		eventService.updateEvent(event, eventId);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/events/{eventId}")
	public void deleteEvent(@PathVariable String eventId){
		eventService.deleteEvent(eventId);
	}
}
