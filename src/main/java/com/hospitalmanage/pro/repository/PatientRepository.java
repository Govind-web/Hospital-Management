package com.hospitalmanage.pro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospitalmanage.pro.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long>  {

}
