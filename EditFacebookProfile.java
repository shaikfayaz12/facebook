package test;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ed")

public class EditFacebookProfile extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException{
		try {
		Cookie c[]	=req.getCookies();
		if(c==null) {
			req.setAttribute("msg", "session expired");
		RequestDispatcher rd=	req.getRequestDispatcher("home.html");
		rd.forward(req, res);
		}else {
		String va=	c[0].getValue();
		req.setAttribute("va", va);
		RequestDispatcher rd=	req.getRequestDispatcher("EditProfile.jsp");
		rd.forward(req, res);
		}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}
