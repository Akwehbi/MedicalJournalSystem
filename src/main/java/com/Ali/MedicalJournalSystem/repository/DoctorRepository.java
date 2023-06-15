package com.Ali.MedicalJournalSystem.repository;

import com.Ali.MedicalJournalSystem.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface DoctorRepository extends JpaRepository <Doctor, Integer>  {

}
