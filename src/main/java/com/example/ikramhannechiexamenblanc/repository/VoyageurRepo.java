package com.example.ikramhannechiexamenblanc.repository;

import com.example.ikramhannechiexamenblanc.entity.Voyageur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface VoyageurRepo  extends JpaRepository<Voyageur,Long> {

    List<Voyageur> findByNomPrenomAnddateNaissance(Voyageur);


}
