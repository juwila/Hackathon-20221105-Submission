package com.wigg.appt.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="provider")
public class Provider {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	private String providerName;
	private List<Doctor> Doctors;
	private Location location;
	private enum specialty{Dermatology,Cardiology,Dentist,EyeSpecialist};
	private String phoneNumber;
	private String emailAddress;
	private List<Patient> patients;
	
}
