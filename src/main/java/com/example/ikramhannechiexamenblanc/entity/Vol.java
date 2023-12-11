package com.example.ikramhannechiexamenblanc.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Vol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idVol;
    LocalDate dateDepart;
    LocalDate dateArrive ;
@ManyToOne Aeroport aeroport;


}
