package com.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.beans.UserPOJO;
import com.dao.DaoInter;
import com.util.DBConnection;

public class DaoImpl implements DaoInter {

	 Connection con;
	 
	 public DaoImpl() {
	        System.out.println("DaoImpl created");
	    }
	
	 public DaoImpl(Connection con) {
	        this.con = con;
	        System.out.println("Connection " + con);
	    }

	@Override
	public boolean register(UserPOJO user) {
try{
			
			PreparedStatement pre=con.prepareStatement("Insert into users(name,email,password) values(?,?,?)");
			pre.setString(1, user.getUserName());
			
			pre.setString(2, user.getEmail());
			
			pre.setString(3, user.getPassword());
			System.out.println(user.getUserName());
			System.out.println(user.getEmail());
			System.out.println(user.getPassword());
			//System.out.printf("Execute record ",pre.executeUpdate());
			int rows = pre.executeUpdate();   

	        System.out.println("Rows inserted: " + rows);

	        return rows > 0;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public UserPOJO login(String userName, String pass) {
		UserPOJO user = null;
		try{
		   PreparedStatement pre = con.prepareStatement("SELECT * FROM users WHERE name=? AND password=?");
			
			pre.setString(1, userName);
			pre.setString(2, pass);
			ResultSet rs=pre.executeQuery();
			
			if(rs.next())
			{
				user=new UserPOJO();
				user.setId(rs.getInt("id"));
				user.setUserName(rs.getString("name"));
				user.setPassword(rs.getString("password"));
				
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		System.out.println("User return "+user);
		return user;
	}

	@Override
	public void updatePassword(String email, String newPass) {
		try{

	        String sql = "UPDATE users SET password=? WHERE email=?";
	        PreparedStatement ps = con.prepareStatement(sql);
	        ps.setString(1, newPass);
	        ps.setString(2, email);
	        ps.executeUpdate();

	    } catch(Exception e){
	        e.printStackTrace();
	    }
		
	}

	@Override
	public void setDaoConnection(Connection con) {
        this.con = con;  // ← SIRF ITNA KARO, naya object mat banao!
        System.out.println("Connection " + con);
    }

	
	

}
