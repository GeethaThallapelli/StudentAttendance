package com.example.attendance;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.http.*;

public class AttendanceListServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = -6796655502249237047L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ArrayList<String> students = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/attendance_db", "root", "root");

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT name FROM students");

            while (rs.next()) {
                students.add(rs.getString("name"));
            }

            rs.close();
            stmt.close();
            conn.close();

            request.setAttribute("studentList", students);
            RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
            rd.forward(request, response);

        } catch (Exception e) {
            throw new ServletException(e);
        }
    }
}
