/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.amat.dao;

import fr.amat.bean.Formation;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author walid
 */
public class FormationDao {
    public static List<Formation> fgetALL() throws SQLException{
		
		List<Formation> result = new ArrayList<Formation>();
		Connection connexion = AmatDao.getConnection();
		String sql = "SELECT * FROM formation";
		Statement ordre = connexion.createStatement();
		ResultSet re1 = ordre.executeQuery(sql);
		while (re1.next()) {
Formation formation = new Formation(re1.getString("intitule"),re1.getString("description")) ;

                                                         
                                
                               
                        
			result.add(formation);
		}
		
		
		return result;
	}
    
    
    
    
}
