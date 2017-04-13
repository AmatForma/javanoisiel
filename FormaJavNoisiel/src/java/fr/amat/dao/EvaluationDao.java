/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.amat.dao;

import fr.amat.bean.Evaluation;
import fr.amat.bean.Personne;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class EvaluationDao {
    public static List<Evaluation> fgetALL() throws SQLException{
		
		List<Evaluation> result = new ArrayList<Evaluation>();
		Connection connexion = AmatDao.getConnection();
		String sql = "SELECT * FROM evaluation";
		Statement ordre = connexion.createStatement();
		ResultSet re1 = ordre.executeQuery(sql);
		while (re1.next()) {
               Evaluation evaluation = new Evaluation(re1.getInt("IdEvaluation"),re1.getInt("IdModule"),re1.getInt("IdSession"),re1.getDate("dateEffet"),re1.getString("Commentaire")); ;

                                                         
                                
                               
                        
			result.add(evaluation);
		}
		
		
		return result;
	}
    
    
/*
public class EvaluationDao {
	
	public static Personne getByLoginPassword(String login, String password) throws SQLException{
		Personne res = null;
		
		String sql = "SELECT * FROM personne WHERE mail=?AND password=?";
		
		Connection connection = AmatDao.getConnection();
		PreparedStatement  ordre = connection.prepareStatement(sql);
		
		ordre.setString(1, login);
		ordre.setString(2, password);
		
		ResultSet resultat = ordre.executeQuery();
		
		if(resultat.next()){
			res = new Personne(login, password);
                        res.setIdPersonne(resultat.getInt("idPersonne"));
                        res.setNom(resultat.getString("nom"));
                        res.setPrenom(resultat.getString("prenom"));
					}
		
		
		return res;
	}
	
	
    
   public static Formation insert(Formation formation) throws SQLException{
		
		
		String sql = "INSERT INTO formation (intitule,description) VALUES (?, ?)";
		Connection connexion = AmatDao.getConnection();
		PreparedStatement ordre = connexion.prepareStatement(sql);
		ordre.setString(1, formation.getIntitule());
		ordre.setString(2, formation.getDescription());
		
		
		ordre.execute();
		
		
		return null;
	}
    
    
    
        
    public static Formation update(Formation formation) throws SQLException{
		
		
		String sql = "UPDATE  formation SET intitule = ? , description = ?";
		Connection connexion = AmatDao.getConnection();
		PreparedStatement ordre = connexion.prepareStatement(sql);
		ordre.setString(1, formation.getIntitule());
		ordre.setString(2, formation.getDescription());
		
		
		ordre.execute();
		
		
		return null;
	}
    
    
    */
    
    

}