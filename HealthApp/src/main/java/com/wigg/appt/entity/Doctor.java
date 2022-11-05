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
@Table(name="doctor")
public class Doctor {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="doctor_id")
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String specialty;
	private List<Provider> providers;
	private List<Appointment> appointments;
}
