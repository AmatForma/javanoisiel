/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.amat.bean;

/**
 *
 * @author walid
 */
public class Formation {
    private int idFormation ;
    private String intitule ;
    private String description ;

    public int getIdFormation() {
        return idFormation;
    }

    public String getIntitule() {
        return intitule;
    }

    public String getDescription() {
        return description;
    }

    public void setIdFormation(int idFormation) {
        this.idFormation = idFormation;
    }

    public void setIntituleF(String intituleF) {
        this.intitule = intituleF;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Formation() {
    }

    public Formation(String intituleF, String description) {
        this.intitule = intituleF;
        this.description = description;
    }

    public Formation(int idFormation, String intitule, String description) {
        this.idFormation = idFormation;
        this.intitule = intitule;
        this.description = description;
    }
    
    
    
}
