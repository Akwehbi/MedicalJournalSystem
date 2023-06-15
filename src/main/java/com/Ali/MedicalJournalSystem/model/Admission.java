package com.Ali.MedicalJournalSystem.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name= "admission")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Admission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //laver ny nummer hvwer gang i primære kode
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

   @OneToMany(mappedBy = "admission", cascade = CascadeType.ALL)
   private List<Doctor> doctors;


    @OneToOne(cascade = CascadeType.ALL)  //forbinder data fra databasen hvor der er en admission til en medicalJournal ||cascadeTypeis  the persistence will propagate (cascade) all EntityManager operations (PERSIST, REMOVE, REFRESH, MERGE, DETACH) to the relating entities.
    @JoinColumn(name = "medicaljournal_id", referencedColumnName = "id")
    @JsonBackReference
   private MedicalJournal medicalJournal; //HUSK STORT J

}
