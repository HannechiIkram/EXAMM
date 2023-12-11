package com.example.ikramhannechiexamenblanc.service;

import com.example.ikramhannechiexamenblanc.entity.Vol;
import com.example.ikramhannechiexamenblanc.entity.Voyageur;
import com.example.ikramhannechiexamenblanc.repository.VoyageurRepo;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ExamenService implements Iservice{

    ExamenService examenService;
    VoyageurRepo voyageurRepoRepo;
  //  @Override
   // public Vol ajouterVolEtAeroport (Vol vol ) {
  //      return examenService.save(Vol);
    //}
  @Override
  public List<Voyageur> ajouterVoyageurs(Voyageur) {
      return VoyageurRepo.findByNomPrenomAnddateNaissance(Voyageur);
  }



}
