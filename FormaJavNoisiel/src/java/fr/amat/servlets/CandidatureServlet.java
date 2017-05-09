package fr.amat.servlets;

import fr.amat.bean.Candidat;
import fr.amat.bean.Candidature;
import fr.amat.bean.Personne;
import fr.amat.dao.CandidatDao;
import fr.amat.dao.CandidatureDao;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "CandidatureServlet", urlPatterns = {"/CandidatureServlet"})
public class CandidatureServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public CandidatureServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        try {

            HttpSession session = request.getSession(true);
            Personne membre = (Personne) session.getAttribute("membre");

            if (membre != null) {
                List<Candidat> candidat = CandidatureDao.getALL();
                request.setAttribute("candidat", candidat);
                request.getRequestDispatcher("/WEB-INF/candidature.jsp").forward(request, response);

            } else {
                request.setAttribute("loginFaux", "Vous devez vous connecter");
                request.getRequestDispatcher("index.jsp").forward(request, response);

            }
        } catch (Exception e) {

            request.setAttribute("msg", e.getMessage());
            out.println(e.getMessage());
        }
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     * response)
     */
    
    protected void doPost1(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        HttpSession session = request.getSession(true);
        Personne membre = (Personne) session.getAttribute("membre");

        PrintWriter out = response.getWriter();

        try {
            int idPersonne = membre.getIdPersonne();
            int idSession = Integer.parseInt(request.getParameter("idSession"));
            int idEtatCandidature = 1;

            Candidature candidature = new Candidature(idPersonne, idSession, idEtatCandidature);
            CandidatureDao.update(candidature);

            List<Candidat> candidat = CandidatDao.getALL();
            request.setAttribute("candidat", candidat);
            request.getRequestDispatcher("/WEB-INF/candidat.jsp").forward(request, response);
            
        } catch (Exception e) {

            request.setAttribute("msg", e.getMessage());
            out.println(e.getMessage());
        }
    }

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        HttpSession session = request.getSession(true);
        Personne membre = (Personne) session.getAttribute("membre");

        PrintWriter out = response.getWriter();

 
        try {
            int idPersonne = membre.getIdPersonne();
            int idSession = Integer.parseInt(request.getParameter("idSession"));
            int idEtatCandidature = 1;
            String intituleA = request.getParameter("Accepter");
            String intituleB = request.getParameter("Refuser");
            
            if(intituleA.equals("accepter")){
                idEtatCandidature = 1;
            }
            else{
                idEtatCandidature = 2;
            }

//            if (intitule == "Accepter") {
//                idEtatCandidature = 1;
//            } 

//String action = request.getParameter("name");
//out.println(action);
//if (        "Refuser".equals(action)) {
//    idEtatCandidature = 2;
//}
            Candidature candidature = new Candidature(idPersonne, idSession, idEtatCandidature);
            CandidatureDao.update(candidature);

            List<Candidat> candidat = CandidatDao.getALL();
            request.setAttribute("candidat", candidat);
            request.getRequestDispatcher("/WEB-INF/candidat.jsp").forward(request, response);
            
        } catch (Exception e) {

            request.setAttribute("msg", e.getMessage());
            out.println(e.getMessage());
        }
    }

}
