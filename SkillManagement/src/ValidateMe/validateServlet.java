package ValidateMe;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.niit.entity.Employee;
import com.niit.repository.*;
/**
 * Servlet implementation class validateServlet
 */
@WebServlet("/validateServlet")
public class validateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public validateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		Employee employee=new Employee();
		crudEmployee obj=new crudEmployee();
		ArrayList<Employee> emparr=new ArrayList<>();
		emparr=obj.fetchData(employee);
		/*
		 employees.setEmpId(rst.getInt(1));
			employees.setEmpName(rst.getString(2));
			employees.setEmpEmail(rst.getString(3));
			employees.setEmpPhone(rst.getString(4));
			employees.setEmpGender(rst.getString(5));
			employees.setEmpAddress(rst.getString(6));
			employees.setEmpCity(rst.getString(7));
			employees.setEmpDob(rst.getString(8));
			employees.setEmpRole(rst.getString(9));
			employees.setEmpNationality(rst.getString(10));
			employees.setEmpPassword(rst.getString(11));
			employees.setEmpStatus(rst.getString(12));
			employees.setEmpIBUName(rst.getString(13));
			
		 */
out.println("<tr><td>ID</td><td>Name</td><td>Email</td><td>Phone</td><td>Gender</td><td>AddressPhone</td>");
		for(Employee e: emparr)
		{
			
			out.println(e.getEmpId());
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
