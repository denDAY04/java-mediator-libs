package dk.asj.example.springmediatr.domain;

import java.util.HashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dk.asj.example.springmediatr.event.NewRealEstateEvent;
import io.jkratz.mediator.core.EventHandler;
import lombok.Getter;

@Getter
public class RealEstateAgent implements Agent, EventHandler<NewRealEstateEvent>{

  private static final Logger logger = LoggerFactory.getLogger(RealEstateAgent.class);

  private String name;
  private Set<RealEstate> opportunities;

  public RealEstateAgent(String name) {
    this.name = name;
    opportunities = new HashSet<>();
  }

  public boolean newOpportunity(RealEstate opportunity) {
    logger.info("Agent {} saving new opportunity {}", name, opportunity.getName());
    return opportunities.add(opportunity);
  }

  @Override
  public boolean expendedOpportunity(RealEstate opportunity) {
    logger.info("Agent {} removing expended opportunity {}", name, opportunity.getName());
    return opportunities.remove(opportunity);
  }

  @Override
  public void handle(NewRealEstateEvent event) {
    newOpportunity(event.getRealEstate());
  }
}
