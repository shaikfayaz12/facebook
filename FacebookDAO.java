package test;

import java.sql.*;

public class FacebookDAO {
	public int k=0;
   public int insert(UserBeanFacebook ubf) {
	   try {
		   Connection con =DBConnection.getCon();
		   PreparedStatement ps=con.prepareStatement("insert into FacebookAccount values(?,?,?,?,?,?,?)");
		  ps.setString(1, ubf.getfName());
		 ps.setString(2, ubf.getlName());
		 ps.setString(3, ubf.getGender());
		 ps.setString(4, ubf.getUserName());
		 ps.setString(5, ubf.getPassword());
		 ps.setLong(6, ubf.getMobileNumber());
		 ps.setString(7, ubf.getEmailId());
		k= ps.executeUpdate();
	   }catch(Exception e) {
		   e.printStackTrace();
	   }
	   
	return k;
	   
   }
}
