package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/log")
public class LogoutFacebook extends HttpServlet {
     protected void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
    	 try {
    	Cookie c[]=	 req.getCookies();
    	if(c==null) {
    		req.setAttribute("msg", "session expired");
    		RequestDispatcher rd=req.getRequestDispatcher("failed.jsp");
    		rd.forward(req, res);
    	}
    	else {
    		ServletContext sc=req.getServletContext();
    		sc.removeAttribute("uytu");
    		c[0].setMaxAge(0);
    		res.addCookie(c[0]);
    		req.setAttribute("msg", "User Logged out Sucessfully..<br>");
    		RequestDispatcher rd=req.getRequestDispatcher("home.jsp");
    		rd.forward(req, res);
    	}
    	 }catch(Exception e) {
    		 e.printStackTrace();
    	 }
     }
}
