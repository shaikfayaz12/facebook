package test;
import java.io.IOException;

import javax.servlet.http.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
@WebServlet("/lo")
public  class FacebookLogin extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException{
	
		UserBeanFacebook ubf=new FacebookLoginDAO().login(req);
		if(ubf==null) {
			req.setAttribute("msg", "invalid login process");
			RequestDispatcher rd=req.getRequestDispatcher("failed.jsp");
			rd.forward(req, res);
		}else {
			ServletContext sc=req.getServletContext();
			sc.setAttribute("uytu", ubf);
			Cookie ck=new Cookie("firstname",ubf.getfName());
			res.addCookie(ck);//Adding Cookie Object to response
			RequestDispatcher rd =

			req.getRequestDispatcher("LoginSuccess.jsp");

			rd.forward(req, res);
			

		}
	}

}
