package caixaEletronico;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Servlet implementation class Caixa
 */
public class Caixa extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Caixa() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double valor = Double.parseDouble(
				request.getParameter("valor"));
		
		Map<Integer, Integer> mapa = new HashMap<Integer, Integer>();
		mapa.put(1, 3);
		mapa.put(2, 4);
		mapa.put(5, 4);
		mapa.put(10, 3);
		mapa.put(50, 3);
		mapa.put(100, 2);
		
		
		Map<Integer, Integer> resp = calcula(mapa, valor);
		
		HttpSession sessao = request.getSession();
		
		sessao.setAttribute("resp", resp);
		
		response.sendRedirect("./caixaResp.jsp");
		
	
	}

	private Map<Integer, Integer> calcula(Map<Integer, Integer> mapa, double valor) {
		
		// aqui voces vao trabalhar
		return mapa;
	}

}
