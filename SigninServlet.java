package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DbMethods;
import com.Employee;

@WebServlet("/signin")
public class SigninServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter out = resp.getWriter();

		try {
			int id = Integer.parseInt(req.getParameter("id"));
			String name = req.getParameter("name");
			String email = req.getParameter("email");
			String password = req.getParameter("password");
			double sal = Double.parseDouble(req.getParameter("sal"));

			DbMethods db = new DbMethods();

			Employee e = new Employee();
			e.setId(id);
			e.setName(name);
			e.setEmail(email);
			e.setPassword(password);
			e.setSal(sal);

			db.saveEmp(e);

			resp.sendRedirect("login.html");

		} catch (Exception e1) {

			out.print("<h1>" + e1 + "</h1>");

		}

	}

}
