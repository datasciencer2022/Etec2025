package pacote;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.time.LocalDate;

/**
 * Servlet implementation class CalculoDias
 */
public class CalculoDias extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculoDias() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
	
		LocalDate dtIni = LocalDate.parse(request.getParameter("dtIni"));
		LocalDate dtFim = LocalDate.parse(request.getParameter("dtFim"));
		
		DifDatas objeto = new DifDatas();
		int resp = objeto.calcDif(dtIni, dtFim);
		
		
		session.setAttribute("dtIni", dtIni);
		session.setAttribute("dtFim", dtFim);
		session.setAttribute("resp", resp);	
	
		
		response.sendRedirect("./calcResp.jsp");
		
		
		
		
		
	}

}
