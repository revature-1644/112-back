package com.example.demo.controller;

import com.example.demo.entity.Flight;
import com.example.demo.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Stereotype components are specialized components that may act in a different way in spring -
 * or, they might act exactly the same as a regular component.
 */
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class FlightController {
    FlightService flightService;
    @Autowired
    public FlightController(FlightService flightService){
        this.flightService = flightService;
    }
    @GetMapping("/flight")
    public List<Flight> getAllFlights(){
        return flightService.getFlights();
    }
    @PostMapping("/flight")
    public void postFlight(@RequestBody Flight flight){
        flightService.saveFlight(flight);
    }
    @GetMapping("/flight/{id}")
    public Flight getFlightById(@PathVariable("id") int id){
        return flightService.getFlightById(id);
    }
}
