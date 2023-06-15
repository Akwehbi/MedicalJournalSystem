package com.Ali.MedicalJournalSystem.repository;

import com.Ali.MedicalJournalSystem.model.MedicalJournal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalJournalRepository extends JpaRepository <MedicalJournal, Integer> {
}
