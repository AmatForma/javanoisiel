/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.amat.dao;

import fr.amat.bean.Module;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author testw10
 */
public class ModuleDao {
    
    public ModuleDao() {

	}

	public void ajouter(Module module) throws SQLException {
		PreparedStatement statement = null;
		Connection connection = AmatDao.getConnection();
		
		String sql = " INSERT INTO module (intitule,description,nbJour)VALUES(?,?,?)";
		if (connection != null && !connection.isClosed()) {
			try {
				statement = connection.prepareStatement(sql);
				statement.setString(1, module.getIntitule());
				statement.setString(2, module.getDescription());
				statement.setInt(3, module.getNbJour());
				statement.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				if (statement != null) {
					try {
						statement.close();

					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		} else {
			AmatDao.getConnection();
		}
	}
	
	public  List<Module> afficher() throws SQLException {
		Connection connection = AmatDao.getConnection();
		PreparedStatement statement = connection.prepareStatement("SELECT * FROM module");
		ResultSet resultat = statement.executeQuery();
		List<Module> list = new ArrayList<Module>();
		while (resultat.next()) {
			 String intitule = resultat.getString("intitule").trim().toLowerCase();
			 String description = resultat.getString("description").trim().toLowerCase();
			 int nbJour = resultat.getInt("nbJour");
			
			Module module = new Module();
			if (resultat != null) {
				module.setIntitule(intitule);
				module.setDescription(description);
				module.setNbJour(nbJour);
				list.add(module);
			}
		}
		return list;
	}
        
        public void modifier(Module module) throws SQLException {
		PreparedStatement statement = null;
		Connection connection = AmatDao.getConnection();
		if (connection != null && !connection.isClosed()) {
                    try{
			statement = connection.prepareStatement("UPDATE module SET intitule=?,  description=?, nbJour=?");
			statement.setString(1, module.getIntitule());
			statement.setString(2, module.getDescription());
                        statement.setInt(3, module.getNbJour());
			statement.executeUpdate();
                        } catch (SQLException e) {
				e.printStackTrace();
			} finally {
				if (statement != null) {
					try {
						statement.close();

					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		} else {
			AmatDao.getConnection();
		}
		
	}
        
        public void deleteById(int id) throws SQLException {
		PreparedStatement statement = null;
		Connection connection = AmatDao.getConnection();
		if (connection != null && !connection.isClosed()) {
                    try{
			statement = connection.prepareStatement("DELETE FROM module WHERE id =?");
			statement.setInt(1, id);
                        statement.executeUpdate();
                        } catch (SQLException e) {
				e.printStackTrace();
			} finally {
				if (statement != null) {
					try {
						statement.close();

					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		} else {
			AmatDao.getConnection();
		}
	}    
}
