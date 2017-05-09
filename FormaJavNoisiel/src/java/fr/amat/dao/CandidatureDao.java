package fr.amat.dao;

import fr.amat.bean.Candidat;
import fr.amat.bean.Candidater;
import fr.amat.bean.Candidature;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CandidatureDao {
    
	public static List<Candidat> getALL() throws SQLException{
		
		List<Candidat> result = new ArrayList<Candidat>();
		Connection connexion = AmatDao.getConnection();

                String sql = "SELECT  p.nom, p.prenom, f.description, s.dateDebut, s.dateFin, e.intitule, c.dateCandidature, c.idSession\n" +
                             "FROM formation f\n" +
                                    "INNER JOIN session s\n" +
                                "ON s.idFormation = f.idFormation\n" +
                                    "INNER JOIN candidature c\n" +
                                "ON c.idSession = s.idSession\n" +
                                    "INNER JOIN personne p\n" +
                                "ON p.idPersonne = c.idPersonne\n" +
                                    "INNER JOIN etatCandidature e\n" +
                                "ON e.idEtatCandidature = c.idEtatCandidature\n" +
                             "WHERE e.idEtatCandidature = 3";
		Statement ordre = connexion.createStatement();
		ResultSet re = ordre.executeQuery(sql);
		while (re.next()) {
			Candidat candidat = new Candidat(re.getString("nom"), re.getString("prenom"),
                                re.getString("description"), re.getDate("dateDebut"), re.getDate("dateFin"),
                                re.getString("intitule"), re.getDate("dateCandidature"), re.getInt("idSession")

                        );
			result.add(candidat);
		}
		
		
		return result;
	}


        
        
	public static Candidature update(Candidature candidature) throws SQLException{
		
      		String sql = "UPDATE candidature SET idEtatCandidature = ? WHERE idPersonne = ? AND idSession = ?";
                Connection connexion = AmatDao.getConnection();
                PreparedStatement ordre = connexion.prepareStatement(sql);
		ordre.setInt(1, candidature.getIdEtatCandidature());
		ordre.setInt(2, candidature.getIdPersonne());
		ordre.setInt(3, candidature.getIdSession());
		
		ordre.execute();
				
  		return null;
	}
        
        
}
