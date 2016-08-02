package Servlets;

import Controller.Controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;

public class BrowseServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        Controller controller = Controller.getInstance();
        ArrayList<String> html;
        if (!request.getParameter("paragraph").isEmpty()) {
            html = controller.Browse(request.getParameter("paragraph"));
        }
        else {
            html = controller.Browse("");
        }
        HttpSession session = request.getSession();
        session.setAttribute("html", html);
        try {
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/browse.jsp");
            rd.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
