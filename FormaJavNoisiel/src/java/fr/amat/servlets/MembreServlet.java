package fr.amat.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.amat.bean.Personne;
import fr.amat.dao.PersonneDao;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MembreServlet
 */
@WebServlet("/MembreServlet")
public class MembreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MembreServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		try {
			HttpSession session = request.getSession(true);
                        Personne membre = (Personne) session.getAttribute("membre");
                        
                        if (membre == null){
                            request.setAttribute("loginFaux", "Vous devez vous connecter");
                            request.getRequestDispatcher("index.jsp").forward(request, response);
                        }
                        
                        else{
                            List<Personne> membres = PersonneDao.getALL();
                            request.setAttribute("membres", membres);
                            request.getRequestDispatcher("/WEB-INF/membre.jsp").forward(request, response);
                            
                            
                        }
			
			
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
