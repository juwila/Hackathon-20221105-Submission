package com.wigg.appt.entity;

import java.sql.Date;
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
@Table(name="patient")
public class Patient {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="patient_id")
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private List<Appointment> appointments;
	private enum gender{Male,Female,Other}
	private Date dob;
	private int age;
	private String password;	
	private double copay;
	private boolean isRegistered;
	
}
