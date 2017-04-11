package fr.amat.dao;
/* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author MHADJIRI
 */
public class SessionDao {
  
public static Session getBySession(String intitule,Date dateDebut,Date dateFin Int nbPlace) throws SQLException{
	Session res =null;
	String sql = "SELECT  f.intitule,s.dateDebut,s.dateFin,s.nbPlace\n" +
"FROM session s, formation f\n" +
"WHERE s.idSession=f.idFormation mail=?AND password=?";
	Connection connection = AmatDao.getConnection();
        
        
        
	PreparedStatement ordre = connection.prepareStatement(sql);
	ordre.setString(1,login);
	ordre.setString(2,password);
	
	ResultSet resultat =ordre.executeQuery();
	if(resultat.next()){
		res = new Personne(login,password);
	}
	
	
	return res;
}
public static Personne insert(Personne membre)throws SQLException{
	String sql="INSERT INTO personne (nom,mail,password)VALUES(?,?,?)";
	Connection connexion =AmatDao.getConnection();
	PreparedStatement ordre = connexion.prepareStatement(sql);
	ordre.setString(1, membre.getNom());
	ordre.setString(2, membre.getEmail());
	ordre.setString(3, membre.getPassword());
	ordre.execute();
	 return null;
}
public static List<Personne> getALL()throws SQLException{
	List<Personne>resultat = new ArrayList<Personne>();
	Connection connexion =AmatDao.getConnection();
	String sql = "SELECT * FROM Personne";
	Statement ordre = connexion.createStatement();
	ResultSet re = ordre.executeQuery(sql);
	while(re.next()){  
}
