package com.example.ikramhannechiexamenblanc.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Reservation {
    @Id
    private String idReservation;

    @Column(name = "dateReservation")
    private LocalDate dateReservation;
    @Enumerated(EnumType.STRING)
    ClassPlace classPlace;

    @Enumerated(EnumType.STRING)
    EtatReservation etatReservation;
    @ManyToOne
    Voyageur voyageur;
    @ManyToOne
    Vol vol;
}