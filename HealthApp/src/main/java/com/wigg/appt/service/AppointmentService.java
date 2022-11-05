package com.wigg.appt.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.wigg.appt.dao.AppointmentRepository;
import com.wigg.appt.entity.Appointment;
import com.wigg.appt.entity.Doctor;

@Service
@Transactional
public class AppointmentService {
	private AppointmentRepository repo;
	
	//List all appointments in system
	public List<Appointment> ListAll(){
		return repo.findAll();
	}
	//List all available appointments for a doctor
//	public List<Appointment> ListOpen(Doctor doctor){
//		//return repo.findAll(null);
//	}
	//Create an appointment, binding it to appropriate entities
	public void save(Appointment appt) {
		repo.save(appt);
	}
}
