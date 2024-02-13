package test;
import java.sql.*;

import javax.servlet.*;
import javax.servlet.http.*;
public class FacebookLoginDAO {
        public UserBeanFacebook ubf=null;
        public UserBeanFacebook login(HttpServletRequest req) {
        	try {
     		   Connection con =DBConnection.getCon();
        		PreparedStatement ps=con.prepareStatement("select * from  FacebookAccount where emailid=? and password=?");
        		ps.setString(1, req.getParameter("mid"));
        		ps.setString(2, req.getParameter("pswd"));
        		ResultSet rs=ps.executeQuery();
        		if(rs.next()) {
        			ubf=new UserBeanFacebook();
        			ubf.setfName(rs.getString(1));
        			ubf.setlName(rs.getString(2));
        			ubf.setGender(rs.getString(3));
        			ubf.setUserName(rs.getString(4));
        			ubf.setPassword(rs.getString(5));
        			ubf.setMobileNumber(rs.getLong(6));
        			ubf.setEmailId(rs.getString(7));
        		}
        	}catch(Exception e) {
        		e.printStackTrace();
        	}
        	
        return ubf;	
        }
}
