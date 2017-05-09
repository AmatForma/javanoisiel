package fr.amat.bean;

import java.util.Date;

public class Candidature {
     
    private int idPersonne ;
    private int idSession ;
    private int idEtatCandidature ;
    private Date dateCandidature ;
    
    public Candidature (){
        
    }
    
    public Candidature(int idPersonne, int idSession, int idEtatCandidature) {
        this.idPersonne = idPersonne;
        this.idSession = idSession;
        this.idEtatCandidature = idEtatCandidature;
    }

    public Candidature(int idPersonne, int idSession, int idEtatCandidature, Date dateCandidature) {
        this.idPersonne = idPersonne;
        this.idSession = idSession;
        this.idEtatCandidature = idEtatCandidature;
        this.dateCandidature = dateCandidature;
    }
    
    

    public int getIdPersonne() {
        return idPersonne;
    }

    public int getIdSession() {
        return idSession;
    }

    public int getIdEtatCandidature() {
        return idEtatCandidature;
    }

    public Date getDateCandidature() {
        return dateCandidature;
    }

    public void setIdPersonne(int idPersonne) {
        this.idPersonne = idPersonne;
    }

    public void setIdSession(int idSession) {
        this.idSession = idSession;
    }

    public void setIdEtatCandidature(int idEtatCandidature) {
        this.idEtatCandidature = idEtatCandidature;
    }

    public void setDateCandidature(Date dateCandidature) {
        this.dateCandidature = dateCandidature;
    }

    
}
