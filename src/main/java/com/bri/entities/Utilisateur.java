package com.bri.entities;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;
@Entity
public class Utilisateur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUtilisateur;
    
    private String nomUtilisateur;
  
    private String prenomUtilisateur;
    
    private String loginUtilisateur;
    
    private String passwordUtilisateur;
   
    private String telephoneUtilisateur;
    
    private String mailUtilisateur;
    @ManyToOne
    private Groupe groupe;


    public Utilisateur() {
        super();
    }

    public Utilisateur(String login,String email,String password) {
        this.loginUtilisateur=login;
        this.mailUtilisateur=email;
        this.passwordUtilisateur=password;
    }
    public Utilisateur( String nomUtilisateur, String prenomUtilisateur, String loginUtilisateur, String passwordUtilisateur, String telephoneUtilisateur, String mailUtilisateur, Groupe groupe) {
        this.idUtilisateur = idUtilisateur;
        this.nomUtilisateur = nomUtilisateur;
        this.prenomUtilisateur = prenomUtilisateur;
        this.loginUtilisateur = loginUtilisateur;
        this.passwordUtilisateur = passwordUtilisateur;
        this.telephoneUtilisateur = telephoneUtilisateur;
        this.mailUtilisateur = mailUtilisateur;
        this.groupe = groupe;
    }
    public Utilisateur(int idUtilisateur, String nomUtilisateur, String prenomUtilisateur, String loginUtilisateur, String passwordUtilisateur, String telephoneUtilisateur, String mailUtilisateur, Groupe groupe) {
        this.idUtilisateur = idUtilisateur;
        this.nomUtilisateur = nomUtilisateur;
        this.prenomUtilisateur = prenomUtilisateur;
        this.loginUtilisateur = loginUtilisateur;
        this.passwordUtilisateur = passwordUtilisateur;
        this.telephoneUtilisateur = telephoneUtilisateur;
        this.mailUtilisateur = mailUtilisateur;
        this.groupe = groupe;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    public void setPrenomUtilisateur(String prenomUtilisateur) {
        this.prenomUtilisateur = prenomUtilisateur;
    }

    public void setLoginUtilisateur(String loginUtilisateur) {
        this.loginUtilisateur = loginUtilisateur;
    }

    public void setPasswordUtilisateur(String passwordUtilisateur) {
        this.passwordUtilisateur = passwordUtilisateur;
    }

    public void setTelephoneUtilisateur(String telephoneUtilisateur) {
        this.telephoneUtilisateur = telephoneUtilisateur;
    }

    public void setMailUtilisateur(String mailUtilisateur) {
        this.mailUtilisateur = mailUtilisateur;
    }

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public String getPrenomUtilisateur() {
        return prenomUtilisateur;
    }

    public String getLoginUtilisateur() {
        return loginUtilisateur;
    }

    public String getPasswordUtilisateur() {
        return passwordUtilisateur;
    }

    public String getTelephoneUtilisateur() {
        return telephoneUtilisateur;
    }

    public String getMailUtilisateur() {
        return mailUtilisateur;
    }
}
