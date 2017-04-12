/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.amat.bean;

/**
 *
 * @author testw10
 */
public class Module {
    
        private int id;
        private String intitule;
	private String description;
	private int nbJour;

	public Module() {
	}

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
        
        

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getNbJour() {
		return nbJour;
	}

	public void setNbJour(int nbJour) {
		this.nbJour = nbJour;
	}

    @Override
    public String toString() {
        return "Module{" + "intitule=" + intitule + ", description=" + description + ", nbJour=" + nbJour + '}';
    }
        
        
    
}
