package com.example.demo.services;

import java.util.*;


import org.springframework.stereotype.Service;
import com.example.demo.entity.Bike;
import com.example.demo.repositories.Bikerepositories;

@Service
public class BikeServicesImplementation implements BikeServices {
	
	Bikerepositories bkrso;

	public BikeServicesImplementation(Bikerepositories bkrso) {
		super();
		this.bkrso = bkrso;
	}

	@Override
	public String addBike(Bike b) {
    bkrso.save(b);
		return "bike is added";
	}

	@Override
	public Bike getBike(String engno) {
		Bike b=bkrso.findById(engno).get();
		return b;
	}

	@Override
	public List<Bike> getAllBike() {
		List<Bike> blist=bkrso.findAll();
		return blist;
	}

	@Override
	public String updateBike(Bike b) {
		bkrso.save(b);
		return "bike object is updated";
	}

	@Override
	public String deleteBike(String engno) {
		bkrso.deleteById(engno);
		return "bike object is deleted";
	}
	
}
