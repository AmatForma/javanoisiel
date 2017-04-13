/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.amat.dao;

import fr.amat.bean.Session;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author MHADJIRI
 */
public class SessionDao {
   public static Session getBySession(String intitule, Date dateDebut, Date dateFin, int nbPlace) throws SQLException {
        Session res = null;
        String sql = "SELECT  f.intitule,s.dateDebut,s.dateFin,s.nbPlace"
                + "FROM session s, formation f"
                + "WHERE s.idSession=f.idFormation intitule=?AND dateDebut=? AND dateFin=? AND nbPlace=?";

        Connection connection = AmatDao.getConnection();

        PreparedStatement ordre = connection.prepareStatement(sql);
        ordre.setString(1, intitule);
        ordre.setDate(2, (java.sql.Date) dateDebut);
        ordre.setDate(3, (java.sql.Date) dateFin);
        ordre.setInt(4, nbPlace);
        ResultSet resultat = ordre.executeQuery();
        if (resultat.next()) {
           // res = new Session(dateDebut, dateFin, nbPlace);
        }

        return res;
    }

    public static Session insert(Session sessionF) throws SQLException {
        String sql = "INSERT INTO session (dateDebut,dateFin,int nbPlace)VALUES(?,?,?)";
        Connection connexion = AmatDao.getConnection();
        PreparedStatement ordre = connexion.prepareStatement(sql);
        ordre.setDate(1, (java.sql.Date) sessionF.getDateDebut());
        ordre.setDate(2, (java.sql.Date) sessionF.getDateFin());
        ordre.setInt(3, sessionF.getNbPlace());
        ordre.execute();
        return null;
    }

    public static List<Session> getALL() throws SQLException {
        List<Session> resultat = new ArrayList<Session>();
        Connection connexion = AmatDao.getConnection();
        String sql = "SELECT * FROM Session";
        Statement ordre = connexion.createStatement();
        ResultSet res = ordre.executeQuery(sql);
        while (res.next()) {
            
              Session sessionf = new Session(res.getInt("idSession"),
                                res.getDate("dateDebut"), res.getDate("dateFin"),
                                res.getInt("nbPlace") );
                   
                    
                       
			resultat.add(sessionf);
		}

		
		return resultat;
        
         
}
}

//public void modifier(Session session) throws SQLException {
//		PreparedStatement statement = null;
//		Connection connection = AmatDao.getConnection();
//		if (connection != null && !connection.isClosed()) {
//			statement = connection.prepareStatement("UPDATE session SET nbPlace=?,  dateDebut=?, dateFin=?");
//			statement.setInt(1, nbPlace.getnbPlace());
//			statement.setDate(2, dateDebut.getdateDebut());
//                        statement.setDate(3, dateFin.getdateFin());
//			statement.executeUpdate();
//		} else 
//{
//			AmatDao.getConnection();
//}
//                
//}
//      }
