package fr.amat.servlets;

import fr.amat.bean.Candidater;
import fr.amat.dao.CandidaterDao;
import fr.amat.bean.Candidature;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CandidaterServlet", urlPatterns = {"/CandidaterServlet"})
public class CandidaterServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
       
    public CandidaterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		try {
			
			List<Candidater> session = CandidaterDao.getALL();
			request.setAttribute("session", session);
			request.getRequestDispatcher("/WEB-INF/candidater.jsp").forward(request, response);
			
		} catch (Exception e) {

			request.setAttribute("msg", e.getMessage());
			out.println(e.getMessage());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		try {
			
			int idPersonne = Integer.parseInt(request.getParameter("idPersonne"));
                        int idSession = Integer.parseInt(request.getParameter("idSession"));
                        int idEtatCandidature = 3;
			Date dateCandidature = Date.from(Instant.MIN);
				
			Candidature candidature = new Candidature(idPersonne, idSession, idEtatCandidature, dateCandidature);
			CandidaterDao.insert(candidature);
			
			request.setAttribute("candidature", candidature);
			
			request.getRequestDispatcher("/candidat.jsp").forward(request, response);
			
			
			
		} catch (Exception e) {
			
			request.setAttribute("msg", e.getMessage());
			out.println(e.getMessage());
		}
	}

}
