package dk.asj.example.springmediatr.domain;

public interface Agent {
  boolean newOpportunity(RealEstate opportunity);
  boolean expendedOpportunity(RealEstate opportunity);
}
