package com.DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.DAO.DAOInterface;
import com.aspect.ConnectionProvider;
import com.beans.User;

//Implementation of all CRUD operation
public class DAOImpl implements DAOInterface {
	
//	PreparedStatement pst;
//	ResultSet rs;
	Transaction t;
	public void insertUser(User u) {
		Session session=ConnectionProvider.ProvideConnection();
		try {
//			pst=con.prepareStatement("Insert into logintable values (?,?)");
//			pst.setString(1,u.getUserName());
//			pst.setString(2, u.getPassword());
//			pst.executeUpdate();
			
			t=session.beginTransaction();
			session.persist(u);
			t.commit();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			t.rollback();
		}finally {
            session.close(); 
        }
		
	}

	public boolean retrive(String username,String password) {
		Session session=ConnectionProvider.ProvideConnection();
		boolean flag=false;
		try {
			/*
			 * pst=con.prepareStatement("select * from logintable where username=?");
			 * pst.setString(1, username); rs=pst.executeQuery(); if (rs.next()) {
			 * flag=true; } else { flag=false; }
			 */
			
			String hql = "FROM User WHERE userName = :uname and password = :password";
	        
	        User user = (User) session.createQuery(hql)
	                                  .setParameter("uname", username).setParameter("password", password)
	                                  .uniqueResult();
			if(user!=null)
			{
				flag=true;
			}
			return flag;
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
            session.close(); 
        }
		return flag;
		
	}
	
}
