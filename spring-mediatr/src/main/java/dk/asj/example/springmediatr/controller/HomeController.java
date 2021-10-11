package dk.asj.example.springmediatr.controller;

import java.util.Set;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dk.asj.example.springmediatr.domain.RealEstateAgent;
import dk.asj.example.springmediatr.domain.RealEstate;

@RestController
@RequestMapping("/")
public class HomeController {

  private Set<RealEstateAgent> agents;

  @GetMapping
  public String index() {
    return "Hi from the home controller";
  }

  @PostMapping("/realestate")
  public void createRealestate(@RequestBody RealEstate newRealEstate) {

  }
}
