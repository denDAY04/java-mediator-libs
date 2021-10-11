package dk.asj.example.springmediatr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import dk.asj.example.springmediatr.domain.Agent;
import dk.asj.example.springmediatr.domain.RealEstateAgent;
import io.jkratz.mediator.core.Mediator;
import io.jkratz.mediator.core.Registry;
import io.jkratz.mediator.spring.SpringMediator;
import io.jkratz.mediator.spring.SpringRegistry;

@SpringBootApplication
public class Application {

  private final ApplicationContext appContext;

  public Application(ApplicationContext context) {
    this.appContext = context;
  }

  @Bean
  public Agent agent1() {
    return new RealEstateAgent("agent1");
  }

  @Bean
  public Agent agent2() {
    return new RealEstateAgent("agent2");
  }

  @Bean
  public Registry registry() {
    return new SpringRegistry(appContext);
  }

  @Bean
  public Mediator mediator(Registry registry) {
    return new SpringMediator(registry);
  }

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
