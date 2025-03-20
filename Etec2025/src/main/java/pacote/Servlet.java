package pacote;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class Exemplo
 */
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String doc1 = request.getParameter("doc1");
		
		String[] doc2Temp = request.getParameterValues("doc2[]");
		
		String doc2 = "";
		
		for(String x: doc2Temp) {
			doc2 = doc2 + x + " , ";
		}
		
		for(int i=0;i<doc2Temp.length;i++) {
			doc2 = doc2 + doc2Temp[i] + " , ";
		}
		
		doc2 = doc2.substring(0,doc2.length()-3);
		
		HttpSession session = request.getSession();
		session.setAttribute("doc1", doc1);
		session.setAttribute("doc2", doc2);
		
		response.sendRedirect("./resp.jsp");
	
	}

}