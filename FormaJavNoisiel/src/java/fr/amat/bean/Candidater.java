package fr.amat.bean;

import java.util.Date;

public class Candidater {

    private String intitule;
    private String description;
    private Date dateDebut;
    private Date dateFin;
    private int idSession;

    public Candidater() {

    }

    public Candidater(String intitule, String description, Date dateDebut, Date dateFin, int idSession) {
        this.intitule = intitule;
        this.description = description;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.idSession = idSession;
    }

    public void setIdSession(int idSession) {
        this.idSession = idSession;
    }

    public int getIdSession() {
        return idSession;
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
