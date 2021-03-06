package fr.amat.servlets;

import fr.amat.bean.Candidat;
import fr.amat.dao.CandidatDao;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CandidatServlet", urlPatterns = {"/CandidatServlet"})
public class CandidatServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
       
    public CandidatServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		try {
			
			List<Candidat> candidat = CandidatDao.getALL();
			request.setAttribute("candidat", candidat);
			request.getRequestDispatcher("/WEB-INF/candidat.jsp").forward(request, response);
			
		} catch (Exception e) {

			request.setAttribute("msg", e.getMessage());
			out.println(e.getMessage());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
