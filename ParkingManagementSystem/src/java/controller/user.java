
package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.LoginAuthenticator;


public class user extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      resp.sendRedirect("home.html"); 
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String username=req.getParameter("username");
        String password=req.getParameter("password");
        String role=req.getParameter("role");
        LoginAuthenticator authenticator=new LoginAuthenticator();
        boolean login=authenticator.isLogin(username, password);
        boolean rolee=authenticator.isRole(username,role);
        //PrintWriter out=resp.getWriter();
        
        
       if(login)
       { 
           
         HttpSession session=req.getSession(true);
         session.setAttribute("username",username);
           // resp.sendRedirect("userdash.jsp");
           if(rolee)
           {
               resp.sendRedirect("userdash.jsp");
           }
          else
           {
               resp.sendRedirect("userdash.jsp");
           }
         
       }
       
        else{
            resp.sendRedirect("home.html");
        }
       
       
    }

    

    
}
