package com.bri.repository;

import com.bri.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur,Integer> {
    Optional<Utilisateur> findByLoginUtilisateur(String login);
    Boolean existsByLoginUtilisateur(String login);
    Boolean existsByMailUtilisateur(String email);
}
