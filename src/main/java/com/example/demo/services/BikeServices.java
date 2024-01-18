package com.example.demo.services;

import java.util.List;

import com.example.demo.entity.Bike;

public interface BikeServices {
    String addBike(Bike b);
    Bike getBike(String engno);
    List<Bike> getAllBike();
    String updateBike(Bike b);
    String deleteBike(String engno);
}
