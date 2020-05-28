package org.tamil.timeline.service;

import java.util.List;
import org.tamil.timeline.domain.Event;

public interface IEventService {
    public List getAllEvents();
    public Event getEvent(Long id);
    public void addEvent(Event event);
    public void updateEvent(Long id, Event event);
    public void deleteEvent(Long id);
}
