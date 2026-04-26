package loginValidation;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.aspect.ConnectionProvider;
import com.beans.hibernate_criteria_practise.User;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import validateinter.ValidateInterface;

public class LoginValidation implements ValidateInterface {

	@Override
	public void SignUp(String user, String pass, String securityQ, String securityA) {
		Session session=ConnectionProvider.ProvideConnection();
		
		try {
			Transaction t=session.beginTransaction();
			User u=new User(user, pass, securityQ, securityA);
			session.persist(u);
			t.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Boolean SignIn(String user, String pass) {
		Session session=ConnectionProvider.ProvideConnection();
		Boolean flag=false;
		try {
			//get
//			User u=(User)session.get(User.class,new Integer(5));
			
			//HQL
//			String hql = "FROM User WHERE name = :uname and pass = :password";
//	        
//	        User u = (User) session.createQuery(hql)
//	                                  .setParameter("uname", user).setParameter("password", pass)
//	                                  .uniqueResult();
			
			//Criteria
			CriteriaBuilder cb=session.getCriteriaBuilder();
			CriteriaQuery<User> cq=cb.createQuery(User.class);
			Root<User> root=cq.from(User.class);
			System.out.println(user);
			System.out.println(pass);
			 cq.select(root).where(cb.and(
					cb.equal(root.get("name"), user),
					cb.equal(root.get("pass"), pass)
					));
//			System.out.println(cq.select(root.get("name")));
//			System.out.println(cq.select(root.get("pass")));
			
			List<User> li=session.createQuery(cq).getResultList();
			if(!li.isEmpty()) {
			    flag = true;
			}
//			if(u!=null)
//			{
//				 flag=true;
//			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

}
