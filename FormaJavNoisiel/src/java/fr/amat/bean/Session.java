/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.amat.bean;
import java.util.Date;
/**
 *
 * @author MHADJIRI
 */
public class Session {
    private  int idSession;
    private int idFormation;
    private Date dateDebut;
    private Date dateFin;
    private int nbPlace;

    public int getIdSession() {
        return idSession;
    }

    public void setIdSession(int idSession) {
        this.idSession = idSession;
    }

    public int getIdFormation() {
        return idFormation;
    }

    public void setIdFormation(int idFormation) {
        this.idFormation = idFormation;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public int getNbPlace() {
        return nbPlace;
    }

    public void setNbPlace(int nbPlace) {
        this.nbPlace = nbPlace;
    }

    public Session() {
    }

    
    public Session(int idSession, int idFormation, Date dateDebut, Date dateFin, int nbPlace) {
        this.idSession = idSession;
        this.idFormation = idFormation;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.nbPlace = nbPlace;
    }
}
    
   