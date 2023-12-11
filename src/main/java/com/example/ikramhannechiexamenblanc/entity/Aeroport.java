package com.example.ikramhannechiexamenblanc.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Aeroport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idAeroport;
    String nom;
    String codeAITA ;
   long telephone;
    @OneToMany(mappedBy = "aeroport")
    private Set<Vol> vols;
    @OneToMany(mappedBy = "aeroport")
    private Set<Vol> volss;
}
