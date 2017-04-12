/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.amat.servlets;

import fr.amat.bean.Module;
import fr.amat.dao.ModuleDao;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author testw10
 */
@WebServlet(name = "ModuleServlet", urlPatterns = {"/module"})
public class ModuleServlet extends HttpServlet {

   
   
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/module.jsp").forward(request, response);
    }

   
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
                List<Module> listmodule = new ArrayList<Module>();
                Module module = new Module();
                String intitule = request.getParameter("intitule").trim().toLowerCase();
		String description = request.getParameter("description").trim().toLowerCase();
                int nbjour = Integer.valueOf(request.getParameter("nbJour").trim().toLowerCase());
                module.setDescription(description);
                module.setIntitule(intitule);
                module.setNbJour(nbjour);


		ModuleDao mDAO = new ModuleDao();
		try {
                        mDAO.ajouter(module);
			listmodule = mDAO.afficher();
                        Set<Module> listemodule = new HashSet<Module>(listmodule);
                        List<Module> list = new ArrayList<Module>(listemodule);
			request.setAttribute("modules", list);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
                 request.getRequestDispatcher("/WEB-INF/listeModule.jsp").forward(request, response);
        
    }
    
    public void supprimerModule(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
                String intitule = request.getParameter("intitule").trim().toLowerCase();
		String description = request.getParameter("description").trim().toLowerCase();
                int nbjour = Integer.valueOf(request.getParameter("nbJour").trim().toLowerCase());
                Module module = new Module();
                module.setDescription(description);
                module.setIntitule(intitule);
                module.setNbJour(nbjour);
                
		ModuleDao mDAO = new ModuleDao();
		try {
                        mDAO.deleteById(module.getId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
