package com.example.LaboBiochimie.Entities;

import lombok.NonNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Admin")
public class Admin implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NonNull
    private String nom;
    @NonNull
    private String prenom;
    @NonNull
    private String login;
    @NonNull
    private String password;
    /*
    @Lob
    private byte[] photoAdmin;
    */
    @OneToMany (mappedBy ="RDVAdmin", cascade = CascadeType.ALL)
    private Set<RendezVous> RDVadmin=new HashSet<>();
    @OneToOne(mappedBy = "patient",cascade = CascadeType.ALL)
    @JoinColumn(name = "id", referencedColumnName = "id")
    private AppUser appUser;

    public long getId() {
        return id;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<RendezVous> getRDVadmin() {
        return RDVadmin;
    }

    public void setRDVadmin(Set<RendezVous> RDVadmin) {
        this.RDVadmin = RDVadmin;
    }

    public AppUser getAppUser() {
        return appUser;
    }

    public void setAppUser(AppUser appUser) {
        this.appUser = appUser;
    }
}
