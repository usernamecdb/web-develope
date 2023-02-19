package bmi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Bmi
 */
@WebServlet("/Bmi")
public class Bmi extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Bmi() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		PrintWriter traVe=response.getWriter();
		traVe.append("<h2> May tinh BMI<h2>");
		String noiDungHTML="<form method = POST action=\"/bmi/Bmi\">"
				+ "				<label for=\"weight\" >Weight(kg):</label>\r\n"
				+ " 			<input type=\"number\" id=\"weight\"name=\"weight\"><br><br>\r\n"
				+ "				<label for=\"height\">Height(cm):</label>\r\n"
				+ "				<input type=\"number\" id=\"height\"name=\"height\"><br><br>"
				+ "				<input type=\"submit\" value=\"tinh\">"
				+ "	</form>";
		traVe.append(noiDungHTML);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		int w=Integer.parseInt(request.getParameter("weight"));
		int h=Integer.parseInt(request.getParameter("height"));
		double bmi= w/(h/100.0*h/100.0);
		String formattedBmi= String.format("%.2f",bmi);
		PrintWriter trave= response.getWriter();
		trave.append("<h2>May tinh BMI</h2>");
		trave.append("BMI cua ban la:");
		trave.append(formattedBmi);
		
		

	}

}
