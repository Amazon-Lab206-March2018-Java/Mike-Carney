

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleProject
 */
@WebServlet("/SimpleProject")
public class SimpleProject extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SimpleProject() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String language = request.getParameter("language");
		String hometown = request.getParameter("hometown");
		if (name == null)  {
			name = request.getParameter("name");
		}
		if ( language == null) {
        	language = request.getParameter("language");
		}
		if (hometown == null) {
        	hometown = request.getParameter("hometown");
        }
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.write("<h1> Hello, My name is " + name + ".<h1>");
		out.write("<h1> My favorite language is " + language + ".<h1>");
		out.write("<h1> My hometown is " + hometown + ".<h1>");
		response.getWriter();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
