package test;

import java.sql.*;

public class UpdateFacebookDAO {
  public int k=0;
  public int update(UserBeanFacebook ubf) {
	  try {
	   Connection con =DBConnection.getCon();
   PreparedStatement ps=  con.prepareStatement("update FacebookAccount set firstname=?,lastname=?,gender=?,mobilenumber=?,emailid=? where username=? and password=?");
		ps.setString(1, ubf.getfName());
		ps.setString(2, ubf.getlName());
		ps.setString(3, ubf.getGender());
		ps.setLong(4, ubf.getMobileNumber());
		ps.setString(5, ubf.getEmailId());
		ps.setString(6, ubf.getUserName());
		ps.setString(7, ubf.getPassword());
	 k=ps.executeUpdate();
	  }catch(Exception e) {
		  e.printStackTrace();
	  }
	  
	  return k;
  }
}
