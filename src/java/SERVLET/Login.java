/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SERVLET;

import CRIPTOG.Criptografia;
import DAO.AdministradorDAO;
import JPA.Administrador;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 *
 * @author Jader
 */
public class Login extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        Administrador admin = new Administrador();
        admin.setTipo(request.getParameter("selecao"));
        admin.setCodAdministrador(Integer.parseInt(request.getParameter("user")));
        Criptografia crip = new Criptografia();
        crip.setSenha(request.getParameter("senha"));
        String criptografado = crip.getSenha();
        admin.setSenha(criptografado);

        try {
            AdministradorDAO logar = new AdministradorDAO();
            Administrador busca = logar.login(admin.getCodAdministrador());
            if(busca == null){
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>ERRO NO LOGIN</title>");
             out.println("<h1>ERRO :" +busca +"</h1>");
            out.println("</head>");
            out.println("<body>");
            //JOptionPane.showMessageDialog(null, "USUARIO INEXISTENTE");
            //out.println("<h1>Servlet Login at " + "USUARIO VAZIO"+ "</h1>");
            //out.println("<h2>teste " + busca.getTipo()+ "</h2>");
            out.println("</body>");
            out.println("</html>");
            }
            
        } finally {
            out.close();
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
        processRequest(request, response);
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
        processRequest(request, response);
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
