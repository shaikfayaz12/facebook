package test;
import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/vi")
public class ViewFacebookServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException{
		try {
		Cookie c[]	=req.getCookies();
		if(c==null) {
			req.setAttribute("msg", "session expaired");
		RequestDispatcher	rd=req.getRequestDispatcher("AccountSucessfull.jsp");
			rd.forward(req,res);
		}else {
		String val=	c[0].getValue();
		req.setAttribute("fl", val);
		RequestDispatcher	rd=req.getRequestDispatcher("ViewFacebook.jsp");
		rd.forward(req,res);
		}
			
		}catch(Exception e ) {
			e.printStackTrace();
		}
	}

}
