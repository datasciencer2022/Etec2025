package pacote;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class Escolher3
 */
public class Escolher3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Escolher3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String numsTemp1 = request.getParameter("nums");
		String numsTemp2[] =  numsTemp1.split(" ");
		
		int nums[] = new int[numsTemp2.length];
		
		for(int i=0; i < numsTemp2.length; i++) {
			nums[i] = Integer.parseInt(numsTemp2[i]);
		}
		
		for (int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		
		int tresMaiores[] = calc3Maiores(nums);
		
		HttpSession session = request.getSession();
		session.setAttribute("tresMaiores", tresMaiores);
		
		response.sendRedirect("resp2.jsp");
		
	}

	private int[] calc3Maiores(int[] nums) {
		int resp[] = new int[3];
		
		for (int i=0; i< nums.length; i++) {
			//aqui estou pegando só os 3 primeiros
			//vocês terão que pegar os 3 maiores
			resp[i] = nums[i];
			if (i == 2) break;
		}
		
		return resp;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
