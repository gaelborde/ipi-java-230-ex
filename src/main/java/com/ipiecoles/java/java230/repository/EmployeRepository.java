package com.ipiecoles.java.java230.repository;

import com.ipiecoles.java.java230.model.Employe;
import org.springframework.data.repository.CrudRepository;

import org.joda.time.LocalDate;
import java.util.List;

public interface EmployeRepository extends CrudRepository<Employe, Long>{
        Employe findByMatricule (String matricule);
        List<Employe> findByNomAndPrenom (String nom, String prenom);
        List<Employe> findByNomIgnoreCase (String nom);
        List<Employe> findByDateEmbaucheBefore (LocalDate dateEmbauche);
        List<Employe> findByDateEmbaucheAfter (LocalDate dateEmbauche);
        List<Employe> findBySalaireGreaterThanOrderBySalaireDesc (Double salaire);

}
