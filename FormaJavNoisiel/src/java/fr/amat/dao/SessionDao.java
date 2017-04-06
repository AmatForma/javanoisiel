///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package fr.amat.dao;
//
//
//import fr.amat.bean.Session;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.List;
import java.util.Date;
//
///**
// *
// * @author MHADJIRI
// */
//public class SessionDao {
// 
//Statement state = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
//            PreparedStatement prepare = this.connect.prepareStatement(
//        
//                "SELECT  s.idSession, s.dateDebut ,s.dateFin,s.nbPlace,"+"f.intitule"+
//                        " FROM Session S"+ "JOIN Formation f ON f.intitule= idFormation");
//		
//		Connection connection = AmatDao.getConnection();
////                int i=0;
////            while(resultat.next()){
////                list_Session.add(i, new Session(
////                        resultat.getChar("intitule"), resultat.getString("dateDebut"), resultat.getInt(""), resultat.getInt("id_discipline"), resultat.getInt("id_categorie"),
////                        resultat.getInt("id_competition"), resultat.getString("nom"), resultat.getString("prenom"), resultat.getString("email"),
////                        resultat.getString("gsm"), resultat.getString("rue"), resultat.getInt("numero"), resultat.getInt("code_postal"),
////                        resultat.getString("ville"), resultat.getString("nom_discipline")));
////                i++;
////            }
// 
//            prepare.close();
//            state.close();
//	
//	
//	public static Personne insert(Personne membre) throws SQLException{
//		
//		
//		String sql = "INSERT INTO personne (nom, mail, password) VALUES (?, ?, ?)";
//		Connection connexion = AmatDao.getConnection();
//		PreparedStatement ordre = connexion.prepareStatement(sql);
//		ordre.setString(1, membre.getNom());
//		ordre.setString(2, membre.getMail());
//		ordre.setString(3, membre.getPassword());
//		
//		ordre.execute();
//		
//		
//		return null;
//	}
//	
////	public static List<Personne> getALL() throws SQLException{
////		
////		List<Personne> result = new ArrayList<Personne>();
////		Connection connexion = AmatDao.getConnection();
////		String sql = "SELECT * FROM personne";
////		Statement ordre = connexion.createStatement();
////		ResultSet re = ordre.executeQuery(sql);
////		while (re.next()) {
////			Personne membre = new Personne(re.getString("nom"),
////					re.getString("mail"), re.getString("password"));
////			result.add(membre);
////		}
////		
////		
////		return result;
//	}
//   
//}
