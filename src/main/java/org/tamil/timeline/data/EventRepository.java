package org.tamil.timeline.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.*;
import org.tamil.timeline.domain.Event;

@Repository
public interface EventRepository extends CrudRepository<Event, Long> {
}
