package com.example.ikramhannechiexamenblanc.controller;

import com.example.ikramhannechiexamenblanc.entity.Vol;
import com.example.ikramhannechiexamenblanc.entity.Voyageur;
import com.example.ikramhannechiexamenblanc.service.Iservice;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@AllArgsConstructor
public class VolController {

    Iservice iservice;

    @GetMapping("findByNomPrenomAnddateNaissance")
    public List<Voyageur> findByNomPrenomAnddateNaissance( @RequestBody Voyageur ){
        return iservice.ajouterVoyageurs(  Voyageur);
    }

   // @PostMapping("ajouterVolEtAeroport")
   // public Vol ajouterVolEtAeroport(@RequestBody Vol vol) {
     //   return iservice.ajouterVolEtAeroport(vol);
   // }
}
