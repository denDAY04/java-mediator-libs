package dk.asj.example.springmediatr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dk.asj.example.springmediatr.domain.Agent;
import dk.asj.example.springmediatr.domain.RealEstateAgent;

@Configuration
public class WebConfig {

  @Bean
  public Agent agent1() {
    return new RealEstateAgent("agent1");
  }

  @Bean
  public Agent agent2() {
    return new RealEstateAgent("agent2");
  }
}
