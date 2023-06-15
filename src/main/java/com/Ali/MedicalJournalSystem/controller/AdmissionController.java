package com.Ali.MedicalJournalSystem.controller;


import com.Ali.MedicalJournalSystem.model.Admission;
import com.Ali.MedicalJournalSystem.service.AdmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admission")
@CrossOrigin
public class AdmissionController {

    @Autowired
    private AdmissionService admissionService;


    @PostMapping("/addadmission")
    public String add(@RequestBody Admission admission) {
        admissionService.saveAdmission(admission);
        return "New admission is added";
    }
}
