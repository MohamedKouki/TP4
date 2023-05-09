package controlleurs;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modeles.clientBean;

/**
 * Servlet implementation class ClientServlet
 */
@WebServlet("/ClientServlet")
public class ClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      String Nom=request.getParameter("nom");
      String Prenom=request.getParameter("prenom");
      String Adresse=request.getParameter("adresse");
      String Telephone=request.getParameter("telephone");
      String Email=request.getParameter("email");

      clientBean client= new clientBean();
      client.setNom(Nom);
      client.setPrenom(Prenom);
      client.setAdresse(Adresse);
      client.setTelephone(Telephone);
      client.setEmail(Email);
      request.setAttribute("client",client);
      
     RequestDispatcher rd=request.getRequestDispatcher("client.jsp");
     
     rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
