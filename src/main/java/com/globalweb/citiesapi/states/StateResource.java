package com.globalweb.citiesapi.states;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estados")
public class StateResource {

	@Autowired
    private StateRepository repository;

    @GetMapping
    public List<State> staties() {
      return repository.findAll();
    }
}
