package com.wigg.appt.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wigg.appt.entity.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {

}
