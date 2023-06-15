package com.Ali.MedicalJournalSystem.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "doctor")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //laver ny nummer hvwer gang i primære kode
    @Column(name = "id")
    private int id;
    private String name;
 //   private String department;


    //laver et mange til en, hvor man kan have mange læger og en admission
  //  @ManyToOne(fetch = FetchType.LAZY) //By default, @ManyToOne associations use the FetchType.EAGER strategy, which can lead to N+1 query issues or fetching more data than necessary.
    //@JoinColumn(name= "admission_id", referencedColumnName = "id") //gemmer id fra admission til en colonne kaldet admission_id
   // private Admission admission;

}
