package com.wigg.appt.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;

@Entity
@Data
@Table(name="appointment")
public class Appointment {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="appt_id")
	private int id;
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="patient_id")
	private int patientId;
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="doctor_id")
	private int doctorId;
	private Date appointmentDate;
	private enum status{Served,Available,Booked,Cancelled,Rescheduled};
	private Date startTime;
	private Date endTime;
	private String reasonForVisit;
	private String typeOfVisit;
	private String reasonForCancelation;
	private Provider provider;
	private enum modeOfCommunication{Phone,Email,Text};
	
}
