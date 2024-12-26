package com.example.demo.service;

import com.example.demo.entity.Flight;
import com.example.demo.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class FlightService {
    FlightRepository flightRepository;
    @Autowired
    public FlightService(FlightRepository flightRepository){
        this.flightRepository = flightRepository;
    }
    public List<Flight> getFlights(){
        return flightRepository.findAll();
    }
    public void saveFlight(Flight flight){
        flightRepository.save(flight);
    }
    public Flight getFlightById(int id){
        Optional<Flight> flightOptional = flightRepository.findById(id);
        if(flightOptional.isEmpty()) {
            return null;
        }else{
            return flightOptional.get();
        }
    }
}
