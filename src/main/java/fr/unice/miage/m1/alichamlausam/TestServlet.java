package fr.unice.miage.m1.alichamlausam;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TestServlet extends HttpServlet
    {
        private String greeting="Hello Test";
    public TestServlet(){}
    public TestServlet(String greeting)
        {
            this.greeting=greeting;
        }
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
        {
            response.setContentType("text/html");
            response.setStatus(HttpServletResponse.SC_OK);
            try {
                response.getWriter().println("<h1>"+greeting+"</h1>");
            } catch (IOException e) {
                e.printStackTrace();
            }
            response.getWriter().println("session=" + request.getSession(true).getId());
        }
    }


