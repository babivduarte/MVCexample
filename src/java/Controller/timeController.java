
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Modelo.Time;
import DAO.Conexao;
import DAO.TimeDAO;

/**
 *
 * @author barbara
 */
public class timeController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String flag = request.getParameter("flag");
        try (PrintWriter out = response.getWriter()) {
            //testes condicionais para o o parâmetro flag;
            if (flag == null) {
                request.getRequestDispatcher("index.html").forward(request, response);
            }
            if ("cadastro".equals(flag)) {
                request.getRequestDispatcher("view/cadastroTime.jsp").forward(request, response);
            }
            if ("cadastrar".equals(flag)) {
                response.setContentType("text/html;charset=ISO=8859-1");
                //instanciando o objeto time e setando os atributos;
                Time time = new Time();
                
                time.setNomeTime(request.getParameter("nome"));
                time.setId(Integer.parseInt(request.getParameter("id")));
                time.setCidadeTime(request.getParameter("cidade"));
                time.setEstadoTime(request.getParameter("estado"));
                time.setPaisTime(request.getParameter("pais"));
                
                //chamando o método incluir() através do objeto da classe TimeDAO e passando time como parâmetro;
                TimeDAO dao = new TimeDAO();
                dao.incluir(time);
                out.print("Cadastro realizado com sucesso!!");
            }
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
