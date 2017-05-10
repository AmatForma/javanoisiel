
package fr.amat.servlets;

import fr.amat.bean.Module;
import fr.amat.dao.ModuleDao;
import java.io.IOException;
import static java.lang.System.out;
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
        request.getRequestDispatcher("/WEB-INF/module.jsp").forward(request, response);
        return;
    }

   
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         //HttpSession session = request.getSession(true);
         listmodule = new ArrayList<Module>();
         module = new Module();
         mDAO = new ModuleDao();  
            

           // String action = request.getParameter("action");
           String action = "lister";
           if(action != null){
                if(action.equals("delete")){
                    supprimerModule(request, response);
                }else if(action.equals("edit")){
                    editerModule(request, response);
                }else if(action.equals("lister")){
                    listerModule(request, response);
                }
           }
            
    }     
        
                
    
    public void supprimerModule(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
                String intitule = request.getParameter("intitule").trim().toLowerCase();
		String description = request.getParameter("description").trim().toLowerCase();
                int nbjour = Integer.valueOf(request.getParameter("nbJour").trim().toLowerCase());
                Module module = new Module();
                module.setDescription(description);
                module.setIntitule(intitule);
                module.setNbJour(nbjour);
                
		mDAO = new ModuleDao();
		try {
                        mDAO.deleteById(module.getId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    
    public void editerModule(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
                
                String intitule = request.getParameter("intitule").trim().toLowerCase();
		String description = request.getParameter("description").trim().toLowerCase();
                int nbjour = Integer.valueOf(request.getParameter("nbJour").trim().toLowerCase());
                Module module = new Module();
                module.setDescription(description);
                module.setIntitule(intitule);
                module.setNbJour(nbjour);
                
		ModuleDao mDAO = new ModuleDao();
		try {
                        mDAO.modifier(module);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public void listerModule(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
                
                String intitule = request.getParameter("intitule").trim().toLowerCase();
		String description = request.getParameter("description").trim().toLowerCase();
                int nbjour = Integer.valueOf(request.getParameter("nbJour").trim().toLowerCase());
                module.setDescription(description);
                module.setIntitule(intitule);
                module.setNbJour(nbjour);
                mDAO = new ModuleDao();
                
		try {
                        
                        mDAO.ajouter(module);
			listmodule = mDAO.afficher();
                        Set<Module> listemodule = new HashSet<Module>(listmodule);
                        List<Module> list = new ArrayList<Module>(listemodule);
			request.setAttribute("modules", list);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			out.println(e.getMessage());
		}
                 request.getRequestDispatcher("/WEB-INF/listeModule.jsp").forward(request, response);
                 return;
    }   
}
