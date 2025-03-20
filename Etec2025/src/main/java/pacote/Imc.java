package pacote;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.text.DecimalFormat;

/**
 * Servlet implementation class Imc
 */
public class Imc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Imc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pesoTmp = request.getParameter("peso");
		pesoTmp = pesoTmp.replace(',', '.');
		
		double peso = Double.parseDouble(pesoTmp);
		
		String alturaTmp = request.getParameter("altura");
		alturaTmp = alturaTmp.replace(',', '.');
		
		double altura = Double.parseDouble(alturaTmp);
		
		double imc = peso / (Math.pow(altura, 2));
		
		HttpSession session = request.getSession();
		DecimalFormat formato = new DecimalFormat("00.00");
		session.setAttribute("imc", formato.format(imc));
		response.sendRedirect("./respImc.jsp");
	}

}
