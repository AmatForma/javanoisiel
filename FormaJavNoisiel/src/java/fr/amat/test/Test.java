/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.amat.test;

import fr.amat.bean.Module;
import fr.amat.dao.AmatDao;
import fr.amat.dao.ModuleDao;
import fr.amat.dao.ModuleFormationDao;
import fr.amat.dao.PersonneDao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author walid
 */
public class Test {
    
    
   public static void main (String args[]) throws SQLException{
       //Connection connection = AmatDao.getConnection() ;
       ModuleDao moduledao = new ModuleDao() ;
       List<Module> listM = new ArrayList<Module>() ;
       
       //System.out.println(moduledao.afficher());
       
       
     
     //moduledao.deleteById(7);
    // PersonneDao personne = new PersonneDao();
     //  System.out.println(  personne.getALL());
    
             
     
       ModuleFormationDao modform = new ModuleFormationDao();
       System.out.println( modform.afficherModFor());
      
       
       
       
   }
    
}
