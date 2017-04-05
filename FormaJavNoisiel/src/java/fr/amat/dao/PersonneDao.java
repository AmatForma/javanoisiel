package fr.amat.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.amat.bean.Personne;

public class PersonneDao {
	
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
					}
		
		
		return res;
	}
	
	
	public static Personne insert(Personne membre) throws SQLException{
		
		
		String sql = "INSERT INTO personne (nom, mail, password) VALUES (?, ?, ?)";
		Connection connexion = AmatDao.getConnection();
		PreparedStatement ordre = connexion.prepareStatement(sql);
		ordre.setString(1, membre.getNom());
		ordre.setString(2, membre.getMail());
		ordre.setString(3, membre.getPassword());
		
		ordre.execute();
		
		
		return null;
	}
	
	public static List<Personne> getALL() throws SQLException{
		
		List<Personne> result = new ArrayList<Personne>();
		Connection connexion = AmatDao.getConnection();
		String sql = "SELECT * FROM personne";
		Statement ordre = connexion.createStatement();
		ResultSet re = ordre.executeQuery(sql);
		while (re.next()) {
			Personne membre = new Personne(re.getString("nom"),
					re.getString("mail"), re.getString("password"));
			result.add(membre);
		}
		
		
		return result;
	}

}
