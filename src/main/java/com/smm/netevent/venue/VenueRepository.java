package com.smm.netevent.venue;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface VenueRepository extends CrudRepository<Venue, String> {
	public List<Venue> findByEventEventId(String eventId);
}
