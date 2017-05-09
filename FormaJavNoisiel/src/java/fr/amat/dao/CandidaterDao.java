package fr.amat.dao;

import fr.amat.bean.Candidater;
import fr.amat.bean.Candidature;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CandidaterDao {
    
	public static List<Candidater> getALL() throws SQLException{
		
		List<Candidater> result = new ArrayList<Candidater>();
		Connection connexion = AmatDao.getConnection();
                String sql = "SELECT f.intitule, f.description, s.dateDebut, s.dateFin, s.idSession\n" +
                             "FROM formation f\n" +
                                    "INNER JOIN session s\n" +
                                "ON s.idFormation = f.idFormation\n" +
                                "where s.dateDebut > sysdate()";
		Statement ordre = connexion.createStatement();
		ResultSet re = ordre.executeQuery(sql);
		while (re.next()) {
			Candidater candidat = new Candidater(re.getString("intitule"),
                                re.getString("description"), re.getDate("dateDebut"), re.getDate("dateFin"),
                                re.getInt("idSession")
                        );
			result.add(candidat);
		}
		
		
		return result;
	}

        	
	
	public static Candidater insert(Candidature candidature) throws SQLException{
		
		
		String sql = "INSERT INTO candidature (idpersonne, idSession, idEtatCandidature) VALUES (?, ?, ?)";
		Connection connexion = AmatDao.getConnection();
		PreparedStatement ordre = connexion.prepareStatement(sql);
		ordre.setInt(1, candidature.getIdPersonne());
		ordre.setInt(2, candidature.getIdSession());
		ordre.setInt(3, candidature.getIdEtatCandidature());
		
		ordre.execute();
		
		
		return null;
	}
        
        
}