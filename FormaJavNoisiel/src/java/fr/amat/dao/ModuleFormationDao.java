/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.amat.dao;

import fr.amat.bean.Module;
import fr.amat.bean.ModuleFormation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author walid
 */
public class ModuleFormationDao {

    public ModuleFormationDao() {

    }

    public static List<ModuleFormation> afficherModFor() throws SQLException {
        Connection connection = AmatDao.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM moduleformation");
        ResultSet resultat = statement.executeQuery();
        List<ModuleFormation> list = new ArrayList<ModuleFormation>();

        while (resultat.next()) {
            int idForm = resultat.getInt("idFormation");
            int idMod = resultat.getInt("idModule");

            ModuleFormation modform = new ModuleFormation();
            if (resultat != null) {
                 modform.getFormation().setIdFormation(idForm);
               modform.getModule().setId(idMod);

                list.add(modform);
            }

        }

        return list;

    }

}
