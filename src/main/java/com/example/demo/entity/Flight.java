package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Flight {
    @Id
    public int flightId;
    public String departureCity;
    public String arrivalCity;

    public Flight(int flightId, String departureCity, String arrivalCity) {
        this.flightId = flightId;
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
    }

    public Flight(){

    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightId=" + flightId +
                ", departureCity='" + departureCity + '\'' +
                ", arrivalCity='" + arrivalCity + '\'' +
                '}';
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }
}