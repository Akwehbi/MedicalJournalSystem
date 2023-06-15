package com.Ali.MedicalJournalSystem.service;

import com.Ali.MedicalJournalSystem.model.Admission;
import com.Ali.MedicalJournalSystem.model.Department;
import com.Ali.MedicalJournalSystem.model.MedicalJournal;
import com.Ali.MedicalJournalSystem.repository.AdmissionRepository;
import com.Ali.MedicalJournalSystem.repository.DepartmentRepository;
import com.Ali.MedicalJournalSystem.repository.DoctorRepository;
import com.Ali.MedicalJournalSystem.repository.MedicalJournalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdmissionServiceImpl implements AdmissionService {
    @Autowired
    private AdmissionRepository admissionRepository;

    @Autowired
    private MedicalJournalRepository medicalJournalRepository;

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Admission saveAdmission(Admission admission) {

        MedicalJournal medicalJournal = admission.getMedicalJournal();
        medicalJournal.setAdmission(admission);
        medicalJournal=medicalJournalRepository.save(medicalJournal);

        return admission;
    }


}
