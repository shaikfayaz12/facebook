package test;
import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/up")

public class UpdateFacebookProfile extends HttpServlet {
	protected void doPost(HttpServletRequest req,HttpServletResponse res)
			throws ServletException,IOException{
		try {
			Cookie c[]=req.getCookies();
			if(c==null) {
				req.setAttribute("msg", "session expaired");
			RequestDispatcher rd=	req.getRequestDispatcher("failed.jsp");
			rd.forward(req, res);
			}
			else {
			String val=	c[0].getValue();
			req.setAttribute("ul", val);
			ServletContext sct = req.getServletContext();
			UserBeanFacebook ubf = (UserBeanFacebook)sct.getAttribute("uytu");
			ubf.setfName(req.getParameter("fname"));
			ubf.setlName(req.getParameter("lname"));
			ubf.setGender(req.getParameter("gd"));
			ubf.setMobileNumber(Long.parseLong(req.getParameter("mno")));
			ubf.setEmailId(req.getParameter("mid"));
				int k=new UpdateFacebookDAO().update(ubf);
				if(k>0) {
					req.setAttribute("up", "Profile updated sucessfully");
				RequestDispatcher rd=	req.getRequestDispatcher("UpdateFacebook.jsp");
				rd.forward(req, res);
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
