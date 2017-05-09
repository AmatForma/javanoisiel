package fr.amat.dao;

import fr.amat.bean.Candidat;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CandidatDao {
    
	public static List<Candidat> getALL() throws SQLException{
		
		List<Candidat> result = new ArrayList<Candidat>();
		Connection connexion = AmatDao.getConnection();

                String sql = "SELECT  p.nom, p.prenom, f.description, s.dateDebut, s.dateFin, e.intitule, c.dateCandidature\n" +
                             "FROM formation f\n" +
                                    "INNER JOIN session s\n" +
                                "ON s.idFormation = f.idFormation\n" +
                                    "INNER JOIN candidature c\n" +
                                "ON c.idSession = s.idSession\n" +
                                    "INNER JOIN personne p\n" +
                                "ON p.idPersonne = c.idPersonne\n" +
                                    "INNER JOIN etatCandidature e\n" +
                                "ON e.idEtatCandidature = c.idEtatCandidature";
		Statement ordre = connexion.createStatement();
		ResultSet re = ordre.executeQuery(sql);
		while (re.next()) {
			Candidat candidat = new Candidat(re.getString("nom"), re.getString("prenom"),
                                re.getString("description"), re.getDate("dateDebut"), re.getDate("dateFin"),
                                re.getString("intitule"), re.getDate("dateCandidature")

                        );
			result.add(candidat);
		}
		
		
		return result;
	}

}
