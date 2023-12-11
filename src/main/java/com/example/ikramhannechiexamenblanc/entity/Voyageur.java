package com.example.ikramhannechiexamenblanc.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Voyageur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idVoyageur;
    String nom;

    String prenom;


    LocalDate dateNaissance ;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="voyageur")
    private Set<Reservation> reservations;


}
