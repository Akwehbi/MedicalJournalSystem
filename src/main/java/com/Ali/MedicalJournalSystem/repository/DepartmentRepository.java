package com.Ali.MedicalJournalSystem.repository;

import com.Ali.MedicalJournalSystem.model.Admission;
import com.Ali.MedicalJournalSystem.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository  extends JpaRepository<Department, Integer> {
}
