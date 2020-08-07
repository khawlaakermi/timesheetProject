package com.bri.repository;

import com.bri.entities.Groupe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
@Repository
public interface GroupeRepository extends JpaRepository<Groupe,Integer> {

    Optional<Groupe> findByLibelleGroupe(String libelle);
}
