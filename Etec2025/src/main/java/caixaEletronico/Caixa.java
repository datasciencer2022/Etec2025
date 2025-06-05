package caixaEletronico;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Servlet implementation class Caixa
 */
@WebServlet("/caixa.do")
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
		mapa.put(20, 4);
		mapa.put(50, 3);
		mapa.put(100, 2);
		
		List<Integer> listaNotas = new ArrayList<Integer>();
		
		for (int chave: mapa.keySet()) {
			listaNotas.add(chave);
		}
		
		Collections.sort(listaNotas, Collections.reverseOrder());
		
		//mostrarNotas(listaNotas);
	
		Map<Integer, Integer> primeiraSolucao = calculaPrimeira(listaNotas, valor);
		
		Map<Integer, Integer> segundaSolucao = calculaSegunda(listaNotas, valor, primeiraSolucao);
		
		HttpSession sessao = request.getSession();
		
		
		// Get the currency instance
        NumberFormat nF
            = NumberFormat
                  .getCurrencyInstance();
        
        String valorStr = nF.format(valor);
		
		sessao.setAttribute("primeiraSolucao", primeiraSolucao);
		
		sessao.setAttribute("segundaSolucao", segundaSolucao);
		sessao.setAttribute("valorStr", valorStr);
		
		response.sendRedirect("./caixaResp.jsp");
	
	}

	private void mostrarNotas(List<Integer> listaNotas) {
		System.out.println("quais são as notas disponíveis:");
		listaNotas.forEach(n -> System.out.print(n+"\t"));
		System.out.println();
	}

	
	private Map<Integer, Integer> calculaPrimeira(List<Integer> listaNotas, double valor) {
		Map<Integer, Integer> resp = new HashMap<Integer, Integer>();
		
		resp.put(50, 1);
		resp.put(20, 2);
		
		return resp;
	}
	
	private Map<Integer, Integer> calculaSegunda(List<Integer> listaNotas, double valor, Map<Integer, Integer> primeiraSolucao) {
		Map<Integer, Integer> resp = new HashMap<Integer, Integer>();
		
		resp.put(50, 1);
		resp.put(10, 4);
		
		return resp;
	}

}
