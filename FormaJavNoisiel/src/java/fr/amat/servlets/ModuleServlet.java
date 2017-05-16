
package fr.amat.servlets;

import fr.amat.bean.Module;
import fr.amat.bean.Personne;
import fr.amat.dao.ModuleDao;
import java.io.IOException;
import static java.lang.System.out;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author testw10
 */
@WebServlet(name = "ModuleServlet", urlPatterns = {"/module"})
public class ModuleServlet extends HttpServlet {
         List<Module> listmodule = null;
         Module module = null;
         ModuleDao mDAO = null;
   
   
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         this.listerModule(request, response);    
    }

   
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         //HttpSession session = request.getSession(true);
         
         listmodule = new ArrayList<Module>();
         module = new Module();
         mDAO = new ModuleDao();  
            

           String action = request.getParameter("name");
           if(action != null){
                if(action.equals("delete")){
                    try {
                        supprimerModule(request, response);
                    } catch (SQLException ex) {
                        Logger.getLogger(ModuleServlet.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else if(action.equals("edit")){
                    try {
                        editerModule(request, response);
                    } catch (SQLException ex) {
                        Logger.getLogger(ModuleServlet.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                    listerModule(request, response);    
           }
            
    }     
        
                
    
    public void supprimerModule(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException, SQLException{
                 ModuleDao mDAO = new ModuleDao();

                String intitule = request.getParameter("intitule").trim().toLowerCase();
		String description = request.getParameter("description").trim().toLowerCase();
                int nbjour = Integer.valueOf(request.getParameter("nbJour").trim().toLowerCase());
                Module module = new Module();
                module.setDescription(description);
                module.setIntitule(intitule);
                module.setNbJour(nbjour);
                listerModule(request, response);
		mDAO = new ModuleDao();
		try {
                        mDAO.deleteById(module.getId());
                        listerModule(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    
    public void editerModule(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException, SQLException{
                
                String intitule = request.getParameter("intitule").trim().toLowerCase();
		String description = request.getParameter("description").trim().toLowerCase();
                int nbjour = Integer.valueOf(request.getParameter("nbJour").trim().toLowerCase());
                Module module = new Module();
                module.setDescription(description);
                module.setIntitule(intitule);
                module.setNbJour(nbjour);
        
		try {
                        mDAO.modifier(module);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public void listerModule(HttpServletRequest request, HttpServletResponse response){
                ModuleDao mDAO = new ModuleDao();
           try{
                HttpSession session = request.getSession(true);
                Personne personne = (Personne) session.getAttribute("membre");
                
               if(personne != null){
                   List<Module> moduleSession = mDAO.afficher();
                   request.setAttribute("sessionModule", moduleSession);
                   request.getRequestDispatcher("/WEB-INF/listeModule.jsp").forward(request, response);
               }
                request.setAttribute("loginFaux", "Vous devez vous connecter");
                request.getRequestDispatcher("index.jsp").forward(request, response);
//                String intitule = request.getParameter("intitule").trim().toLowerCase();
//		String description = request.getParameter("description").trim().toLowerCase();
//                int nbjour = Integer.valueOf(request.getParameter("nbJour").trim().toLowerCase());
//                module.setDescription(description);
//                module.setIntitule(intitule);
//                module.setNbJour(nbjour);
//                mDAO = new ModuleDao();
                
//		try {
//                        
//                        mDAO.ajouter(module);
//			listmodule = mDAO.afficher();
//                        Set<Module> listemodule = new HashSet<Module>(listmodule);
//                        List<Module> list = new ArrayList<Module>(listemodule);
//			request.setAttribute("modules", list);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			out.println(e.getMessage());
//		}
                 
                 
        }   catch(Exception e){
            request.setAttribute("msg", e.getMessage());
            out.println(e.getMessage());
            }
    }
}
