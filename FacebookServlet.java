package test;

import java.io.*;

import javax.servlet.*;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@SuppressWarnings("serial")
@WebServlet("/face")
public class FacebookServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		try {
		PrintWriter pw=	res.getWriter();
			res.setContentType("text/html");
			UserBeanFacebook ubf=new UserBeanFacebook();
		   ubf.setfName(req.getParameter("fname"));
		   ubf.setlName(req.getParameter("lname"));
		    ubf.setGender( req.getParameter("gd"));
		    ubf.setUserName(req.getParameter("uname"));
		    ubf.setPassword(req.getParameter("pswd"));
		    ubf.setMobileNumber(Long.parseLong(req.getParameter("mno")));
		    ubf.setEmailId(req.getParameter("mid"));
        int k= new FacebookDAO().insert(ubf);
			if(k>0) {
				req.setAttribute("msg", "Registration process Successfull..<br>");
			}
			RequestDispatcher rd=req.getRequestDispatcher("AccountSucessfull.jsp");
			rd.forward(req, res);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	
}
