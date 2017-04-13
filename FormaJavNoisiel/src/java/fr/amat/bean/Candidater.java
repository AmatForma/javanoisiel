package fr.amat.bean;

import java.util.Date;

public class Candidater {

    private String intitule;
    private String description;
    private Date dateDebut;
    private Date dateFin;
    
    public Candidater (){
        
    }
    
    public Candidater(String intitule, String description, Date dateDebut, Date dateFin) {
        this.intitule        = intitule;
        this.description     = description;
        this.dateDebut       = dateDebut;
        this.dateFin         = dateFin;
    }   

    public String getIntitule() {
        return intitule;
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

    public void setIntitule(String intitule) {
        this.intitule = intitule;
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
    
    
}
