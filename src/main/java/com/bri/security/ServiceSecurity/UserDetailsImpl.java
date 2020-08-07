package com.bri.security.ServiceSecurity;

import com.bri.entities.Utilisateur;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Objects;

public class UserDetailsImpl implements UserDetails {

    private static final long serialVersionUID = 1L;

    private int id;
    private String nom;
    private String prenom;
    private String login;
    private String email;
    @JsonIgnore
    private String password;

    public UserDetailsImpl(int id,String nom,String prenom,String login,String email, String password) {
        this.id = id;
        this.nom = nom;
        this.prenom=prenom;
        this.login=login;
        this.email = email;
        this.password = password;
    }
    public static UserDetailsImpl build(Utilisateur user) {


        return new UserDetailsImpl(
                user.getIdUtilisateur(),
                user.getNomUtilisateur(),
                user.getPrenomUtilisateur(),
                user.getLoginUtilisateur(),
                user.getMailUtilisateur(),
                user.getPasswordUtilisateur());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return login;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        UserDetailsImpl user = (UserDetailsImpl) o;
        return Objects.equals(id, user.id);
    }
}
