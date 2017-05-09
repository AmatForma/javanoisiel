package fr.amat.dao;

import fr.amat.bean.Candidature;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CandidatureDao {
    
	public static List<Candidature> getALL() throws SQLException{
		
		List<Candidature> result = new ArrayList<Candidature>();
		Connection connexion = AmatDao.getConnection();
		String sql = "SELECT * FROM candidature";
		Statement ordre = connexion.createStatement();
		ResultSet re = ordre.executeQuery(sql);
		while (re.next()) {
			Candidature candidature = new Candidature(re.getInt("idPersonne"),
                                re.getInt("idSession"), re.getInt("idEtatCandidature"),
                                re.getDate("dateCandidature")
                        );
			result.add(candidature);
		}
		
		
		return result;
	}

}
