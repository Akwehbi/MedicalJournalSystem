package com.Ali.MedicalJournalSystem.model;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "medicaljournal")
public class MedicalJournal {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    private String name;
    private int securitynum;

    //En til en relation til admission
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "medicalJournal")
    @JsonManagedReference
    private Admission admission;

}

