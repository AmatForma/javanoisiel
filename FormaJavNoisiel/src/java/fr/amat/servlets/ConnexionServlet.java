package fr.amat.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.amat.bean.Personne;
import fr.amat.dao.PersonneDao;

@WebServlet("/ConnexionServlet")
public class ConnexionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
        
    public ConnexionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		request.getRequestDispatcher("/index.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter out =  response.getWriter() ;

		try {
			
			String mailRecup = request.getParameter("login");
			String pwdRecup = request.getParameter("password");
						
			Personne membre = PersonneDao.getByLoginPassword(mailRecup, pwdRecup);
			
			
			if(membre != null){
				
                            // Le mettre en session
                                request.getSession(true).setAttribute("membre", membre);
				request.setAttribute("membre", membre);
				request.getRequestDispatcher("/WEB-INF/profil.jsp").forward(request, response);			
				
				}
			else {
				request.setAttribute("loginFaux", "Utilisateur inconnu ou mot de passe erronné");
				request.getRequestDispatcher("index.jsp").forward(request, response);

			}
			
		} catch (Exception e) {
			
			request.setAttribute("msg", e.getMessage());
			out.println(e.getMessage());
		}
		
			}

}
