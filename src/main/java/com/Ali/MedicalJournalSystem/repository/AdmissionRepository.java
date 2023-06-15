package com.Ali.MedicalJournalSystem.repository;

import com.Ali.MedicalJournalSystem.model.Admission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdmissionRepository extends JpaRepository<Admission, Integer> {

}
