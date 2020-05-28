package org.tamil.timeline.webapp;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import org.tamil.timeline.domain.Event;
import org.tamil.timeline.service.EventService;

@RestController
public class EventController {

    @Autowired
    private EventService eventService;

    @GetMapping("/events")
    public List getAllEvents() {
        return eventService.getAllEvents();
    }

    @GetMapping("/events/{id}")
    public Event getEvent(@PathVariable Long eventId){
        return eventService.getEvent(eventId);
    }

    @PostMapping("/events")
    public void addEvent(@RequestBody Event event) {
        eventService.addEvent(event);
    }

    @PutMapping("/events/{id}")
    public void updateEvent(@PathVariable Long eventId, @RequestBody Event event) {
        eventService.updateEvent(eventId, event);
    }

    @DeleteMapping("/events/{id}")
    public void deleteEvent(@PathVariable Long eventId) {
        eventService.deleteEvent(eventId);
    }
}