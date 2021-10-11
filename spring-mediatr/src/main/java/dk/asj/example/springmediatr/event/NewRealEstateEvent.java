package dk.asj.example.springmediatr.event;

import dk.asj.example.springmediatr.domain.RealEstate;
import io.jkratz.mediator.core.Event;
import lombok.Value;

@Value
public class NewRealEstateEvent implements Event {
  final RealEstate realEstate;
}
