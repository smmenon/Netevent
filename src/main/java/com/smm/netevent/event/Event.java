package com.smm.netevent.event;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Event {
	
	@Id
	private String eventId;	
	private String eventName;
	private String eventDesc;
	private String category;	
	private Boolean isCancelled;
	private Boolean isDraft;
	
	public Event() {
		
	}

	public Event(String eventId, String eventName, String eventDesc) {
		super();
		this.eventId = eventId;
		this.eventName = eventName;
		this.eventDesc = eventDesc;
	}
	
	public String getEventId() {
		return eventId;
	}
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getEventDesc() {
		return eventDesc;
	}
	public void setEventDesc(String eventDesc) {
		this.eventDesc = eventDesc;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Boolean getIsCancelled() {
		return isCancelled;
	}

	public void setIsCancelled(Boolean isCancelled) {
		this.isCancelled = isCancelled;
	}

	public Boolean getIsDraft() {
		return isDraft;
	}

	public void setIsDraft(Boolean isDraft) {
		this.isDraft = isDraft;
	}
	
	
}
