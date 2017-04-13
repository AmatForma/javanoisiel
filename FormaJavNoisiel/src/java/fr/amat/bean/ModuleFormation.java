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
public class ModuleFormation {
    
    private Formation formation ;
    private Module module ;

    public ModuleFormation(Formation formation, Module module) {
        this.formation = formation;
        this.module = module;
    }

    public ModuleFormation() {
    }

    public Formation getFormation() {
        return formation;
    }

    public Module getModule() {
        return module;
    }

    public void setFormation(Formation formation) {
        this.formation = formation;
    }

    public void setModule(Module module) {
        this.module = module;
    }
    
    
    
    
}
