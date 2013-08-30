package ru;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


//@WebServlet(name = "LoginServlet.")
public class LoginServlet extends HttpServlet {
   // private static final long serialVersionUID = 1L;
    public LoginServlet(){
        super();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            System.out.println("In the login Servlet");
            UserInfo user = new UserInfo();
            user.setUserName(request.getParameter("uname"));
            user.setPassword(request.getParameter("password"));
            user = LoginDAO.login(user);
            if(user.isValid()){
               // HttpSession session = request.getSession(true);
                //session.setAttribute("currentSessionUser",user);
                response.sendRedirect("LoginSuccess.jsp");
            }
            else {
                response.sendRedirect("LoginFailed.jsp");
            }
        }
        catch (Throwable e){
            System.out.println(e);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
