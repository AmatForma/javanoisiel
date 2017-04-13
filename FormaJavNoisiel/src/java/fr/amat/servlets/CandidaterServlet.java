/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.amat.servlets;

import fr.amat.bean.Candidat;
import fr.amat.bean.Candidater;
import fr.amat.bean.Candidature;
import fr.amat.bean.Personne;
import fr.amat.dao.CandidatDao;
import fr.amat.dao.CandidaterDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Amat
 */
@WebServlet(name = "CandidaterServlet", urlPatterns = {"/CandidaterServlet"})
public class CandidaterServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CandidaterServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CandidaterServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        try {

            HttpSession session = request.getSession(true);
            Personne membre = (Personne) session.getAttribute("membre");

            if (membre != null) {

                List<Candidater> uneSession = CandidaterDao.getALL();
                request.setAttribute("session", uneSession);
                request.getRequestDispatcher("/WEB-INF/candidater.jsp").forward(request, response);

                request.getSession(true).setAttribute("session", uneSession);
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
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        Personne membre = (Personne) session.getAttribute("membre");

        PrintWriter out = response.getWriter();

        try {
            int idPersonne = membre.getIdPersonne();
            int idSession = Integer.parseInt(request.getParameter("idSession"));
            int idEtatCandidature = 3;

            Candidature candidature = new Candidature(idPersonne, idSession, idEtatCandidature);
            CandidaterDao.insert(candidature);

            List<Candidat> candidat = CandidatDao.getALL();
            request.setAttribute("candidat", candidat);

            request.getRequestDispatcher("/WEB-INF/candidat.jsp").forward(request, response);
        } catch (Exception e) {

            request.setAttribute("msg", e.getMessage());
            out.println(e.getMessage());
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
