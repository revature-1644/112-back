package com.example.demo.service;

import com.example.demo.entity.Flight;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class FlightService {
    List<Flight> flights;
    public FlightService(){
        flights = new ArrayList<>();
        flights.add(new Flight(100, "tampa", "nyc"));
        flights.add(new Flight(101, "nyc", "tampa"));
        flights.add(new Flight(102, "nyc", "dallas"));
    }
    public List<Flight> getFlights(){
        return flights;
    }
    public void saveFlight(Flight flight){
        flights.add(flight);
    }
    public Flight getFlightById(int id){
        for(int i = 0; i < flights.size(); i++){
            if(flights.get(i).getFlightId() == id){
                return flights.get(i);
            }
        }
        return null;
    }
}
