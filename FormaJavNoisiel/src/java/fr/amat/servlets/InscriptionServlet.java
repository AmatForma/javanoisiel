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

/**
 * Servlet implementation class InscriptionServlet
 */
@WebServlet("/InscriptionServlet")
public class InscriptionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InscriptionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("/WEB-INF/inscription.jsp").forward(request, response);
	} 

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		try {
			
			String prenom = request.getParameter("nom");
			String nom = request.getParameter("nom");
			String mail = request.getParameter("nom");
			String adresse = request.getParameter("nom");
			String codePostal = request.getParameter("nom");
			String ville = request.getParameter("mail");
			String password = request.getParameter("password");
			String telephone = request.getParameter("password");
			
			Personne member = new Personne(prenom, nom, mail, adresse, codePostal, ville, password, telephone);
			PersonneDao.insert(member);
			
			request.setAttribute("membre", member);
			
			request.getRequestDispatcher("/index.jsp").forward(request, response);
			
			
			
		} catch (Exception e) {
			
			request.setAttribute("msg", e.getMessage());
			out.println(e.getMessage());
		}
	}

}
