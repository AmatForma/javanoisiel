package fr.amat.bean;

import java.util.Date;

public class Candidat {
    private String nom;
    private String prenom;
    private String description;
    private Date dateDebut;
    private Date dateFin;
    private String intitule;
    private Date dateCandidature;

    public Candidat (){
        
    }
    
    public Candidat(String nom, String prenom, String description, Date dateDebut, Date dateFin, String intitule, Date dateCandidature) {
        this.nom             = nom;
        this.prenom          = prenom;
        this.description     = description;
        this.dateDebut       = dateDebut;
        this.dateFin         = dateFin;
        this.intitule        = intitule;
        this.dateCandidature = dateCandidature;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getDescription() {
        return description;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public String getIntitule() {
        return intitule;
    }

    public Date getDateCandidature() {
        return dateCandidature;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public void setDateCandidature(Date dateCandidature) {
        this.dateCandidature = dateCandidature;
    }

}
