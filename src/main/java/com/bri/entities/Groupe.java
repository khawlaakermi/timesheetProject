package com.bri.entities;

import org.hibernate.engine.internal.Cascade;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import javax.validation.constraints.NotBlank;
@Entity
public class Groupe implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idGroupe;
    
    private String libelleGroupe;
    
    private String descriptionGroupe;
    @OneToMany(mappedBy = "groupe",cascade = CascadeType.ALL)
    private Collection<Utilisateur> utilisateurs;

    public Groupe()
    {
        super();
    }

    public Groupe(int idGroupe, String libelleGroupe, String descriptionGroupe, Collection<Utilisateur> utilisateurs) {
        this.idGroupe = idGroupe;
        this.libelleGroupe = libelleGroupe;
        this.descriptionGroupe = descriptionGroupe;
        this.utilisateurs = utilisateurs;
    }

    public Collection<Utilisateur> getUtilisateurs() {
        return utilisateurs;
    }

    public void setUtilisateurs(Collection<Utilisateur> utilisateurs) {
        this.utilisateurs = utilisateurs;
    }

    public int getIdGroupe() {
        return idGroupe;
    }

    public void setIdGroupe(int idGroupe) {
        this.idGroupe = idGroupe;
    }

    public String getLibelleGroupe() {
        return libelleGroupe;
    }

    public void setLibelleGroupe(String libelleGroupe) {
        this.libelleGroupe = libelleGroupe;
    }

    public String getDescriptionGroupe() {
        return descriptionGroupe;
    }

    public void setDescriptionGroupe(String descriptionGroupe) {
        this.descriptionGroupe = descriptionGroupe;
    }
}
