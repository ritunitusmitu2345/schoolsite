package app.gaeapp;

import java.io.IOException;
import javax.servlet.http.*;


/* The servlet reverts home.jsp file as response .*/

@SuppressWarnings("serial")
public class GaeappServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.sendRedirect("home.jsp");
	}
}
