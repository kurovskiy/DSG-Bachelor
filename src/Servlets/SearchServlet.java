package Servlets;

import Controller.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;

public class SearchServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        Controller controller = Controller.getInstance();
        ArrayList<String> html;
        if (!request.getParameter("start").isEmpty() && !request.getParameter("end").isEmpty()) {
            int start = Integer.parseInt(request.getParameter("start"));
            int end = Integer.parseInt(request.getParameter("end"));
            if (start > 0 && start < end) {
                html = controller.Search(request.getParameter("query"), start, end);
            }
            else {
                html = controller.Search(request.getParameter("query"), 0, 0);
            }
        }
        else {
            html = controller.Search(request.getParameter("query"), 0, 0);
        }
        // response.setContentType("text/html");
        HttpSession session = request.getSession();
        session.setAttribute("html", html);
        try {
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/results.jsp");
            rd.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
