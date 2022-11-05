package com.wigg.appt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wigg.appt.entity.Appointment;
import com.wigg.appt.entity.Doctor;
import com.wigg.appt.service.AppointmentService;

@RestController
public class AppointmentController {
	@Autowired
	private AppointmentService service;
	
	//Get a list of all appointments
	@GetMapping("appointment_scheduling_app/agent/{id}/")
	public List<Appointment> list(){
		return service.ListAll();
	}
	
	//Get a list of open slots for 
	@GetMapping("appointment_scheduling_app/doctor/{id}")
	public List<Appointment> listOpen(@RequestBody Doctor doctor, @PathVariable Integer id){
		return null;
	}
	
	//Add an appointment to the database
	@PostMapping("appointment_scheduling_app/agent/{id}/appointment")
	public void add(@RequestBody Appointment appt, @PathVariable Integer id){
		service.save(appt);
	}
}
