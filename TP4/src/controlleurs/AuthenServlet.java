package controlleurs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modeles.Personne;


/**
 * Servlet implementation class AuthenServlet
 */
@WebServlet("/AuthenServlet")
public class AuthenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthenServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session = request.getSession();
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		if (nom != null && !nom.isEmpty() && prenom != null && !prenom.isEmpty())
		{
		    Personne personneAuthentifiee = new Personne(nom, prenom);
		    session.setAttribute("personneAuthentifiee", personneAuthentifiee);
		    request.getRequestDispatcher("welcom.jsp").forward(request, response);
		} else if(session.getAttribute("personneAuthentifiee")!=null){
			request.getRequestDispatcher("welcom.jsp").forward(request, response);
		}
		else {
			 PrintWriter out = response.getWriter();
		        out.println("<script type=\"text/javascript\">");
		        out.println("alert('Veuillez saisir un nom et un prénom');");
		        out.println("window.location.href='authentifier.html';");
		        out.println("</script>");
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
