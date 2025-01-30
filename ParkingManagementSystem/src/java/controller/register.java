
package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.RegisterAuthenticator;


public class register extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
               String id=req.getParameter("id");
              String username=req.getParameter("username");
              String password=req.getParameter("password");
              String email=req.getParameter("email");
              String role= req.getParameter("role");
              String phone=req.getParameter("phone");
              RegisterAuthenticator r1=new RegisterAuthenticator();
              boolean register=r1.isRegister(id, username, password, role, phone, email);
              if(register)
              {
                  HttpSession session=req.getSession(true);
          session.setAttribute("username",username);
         resp.sendRedirect("home.html"); 
              }
              else
              {
                  resp.sendRedirect("register.html");
              }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       resp.sendRedirect("home.html");
    }

}
