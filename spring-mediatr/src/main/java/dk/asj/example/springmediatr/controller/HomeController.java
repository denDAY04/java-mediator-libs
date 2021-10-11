package dk.asj.example.springmediatr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.jkratz.mediator.core.Mediator;
import dk.asj.example.springmediatr.domain.RealEstate;
import dk.asj.example.springmediatr.event.NewRealEstateEvent;

@RestController
@RequestMapping("/")
public class HomeController {

  private final Mediator mediator;

  public HomeController(Mediator mediator) {
    this.mediator = mediator;
  }

  @GetMapping
  public String index() {
    return "Hi from the home controller";
  }

  @GetMapping("/real-estate/{name}")
  public void createRealestate(@PathVariable("name") String name) {
    var command = new NewRealEstateEvent(new RealEstate(name));
    mediator.emit(command);
  }
}
