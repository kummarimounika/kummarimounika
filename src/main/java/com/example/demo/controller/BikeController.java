package com.example.demo.controller;


import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Bike;
import com.example.demo.services.BikeServices;

@RestController
@RequestMapping("/bike")
public class BikeController {

	BikeServices bk;

	public BikeController(BikeServices bk) {
		super();
		this.bk = bk;
	}
	//creating a bike objects
	@PostMapping
	public String addBike(@RequestBody Bike b) {
		String msg=bk.addBike(b);
		return msg;
	}
	
	//fetching a bike objects
	@GetMapping(value="{engno}")
	public Bike getBike(@PathVariable String engno) {
	Bike b=bk.getBike(engno);
	return b;
	
	}
	
	//fetching all bike objects
	@GetMapping
	public List<Bike> getAllBike() {
	List<Bike> blist=bk.getAllBike();
	return blist;
}
	
	//update bike objects
	@PutMapping
	public String updateBike(@RequestBody Bike b) {
		String b1=bk.updateBike(b);
		return b1;
	}
	
	//delete bike object
	@DeleteMapping(value="{engno}")
	public String deleteBike(@PathVariable String engno) {
		String b2=bk.deleteBike(engno);
		return b2;
	}
}