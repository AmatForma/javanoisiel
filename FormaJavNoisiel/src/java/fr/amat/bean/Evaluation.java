/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.amat.bean;
import java.util.Date;

/**
 *
 * @author scamo
 */
public class Evaluation {
    private int idEvaluation;
    private int idModule ;
    private int idSession;
    private Date dateEffet;
    private String commentaire ;

    public Evaluation(int idEvaluation, int idModule, int idSession, Date dateEffet) {
        this.idEvaluation = idEvaluation;
        this.idModule = idModule;
        this.idSession = idSession;
        this.dateEffet = dateEffet;
    }

    public int getIdEvaluation() {
        return idEvaluation;
    }

    public int getIdModule() {
        return idModule;
    }

    public int getIdSession() {
        return idSession;
    }

    public Date getDateEffet() {
        return dateEffet;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setIdEvaluation(int idEvaluation) {
        this.idEvaluation = idEvaluation;
    }

    public void setIdModule(int idModule) {
        this.idModule = idModule;
    }

    public void setIdSession(int idSession) {
        this.idSession = idSession;
    }

    public void setDateEffet(Date dateEffet) {
        this.dateEffet = dateEffet;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }
   
    
    
    
}
    




    