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
	
		Map<Integer, Integer> solucao = calcular(mapa, listaNotas, valor);
		
		HttpSession sessao = request.getSession();
		
		
		// Get the currency instance
        NumberFormat nF
            = NumberFormat
                  .getCurrencyInstance();
        
        String valorStr = nF.format(valor);
		
        if (solucao == null) {
        	sessao.setAttribute("message", "Não foi possível");
        	sessao.setAttribute("solucao", null);
        }
        else {
        	sessao.setAttribute("solucao", solucao);	
        	sessao.setAttribute("message", "Solução encontrada");
        }
		
		
		sessao.setAttribute("valorStr", valorStr);
		
		response.sendRedirect("./caixaResp.jsp");
	
	}

	private void mostrarNotas(List<Integer> listaNotas) {
		System.out.println("quais são as notas disponíveis:");
		listaNotas.forEach(n -> System.out.print(n+"\t"));
		System.out.println();
	}

	
	private Map<Integer, Integer> calcular(Map<Integer,Integer> mapa, List<Integer> listaNotas, double valor) {
		
		Map<Integer, Integer> resp = new HashMap<Integer, Integer>();
		double restDiv = 0;
		double valorMomento = valor;
		int quantEstoque = 0;
		double soma = 0.0;
		int quantNotas = 0;
		for(Integer valorNota: listaNotas) {
			quantEstoque = mapa.get(valorNota);
			restDiv = valorMomento / valorNota.doubleValue();
			quantNotas = 0;
			while (restDiv >= 1) {
				quantNotas++;
				valorMomento = valorMomento - valorNota;
				soma += valorNota;
				restDiv = valorMomento / valorNota.doubleValue();
				quantEstoque--;
				if (quantEstoque == 0) {
					break;
				}
			}
			if (quantNotas > 0) {
				resp.put(valorNota, quantNotas);
			}
		}
		
		if (resp.isEmpty() || (soma < valor)) {
			resp = null;
		}
		return resp;
	}

}
