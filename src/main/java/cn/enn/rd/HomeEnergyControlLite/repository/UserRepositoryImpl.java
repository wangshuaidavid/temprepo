package cn.enn.rd.HomeEnergyControlLite.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import cn.enn.rd.HomeEnergyControlLite.entity.User;

public class UserRepositoryImpl {
	 @PersistenceContext  
	 private EntityManager em;
	 /*
	    public Page<Object[]> getByCondition(UserQueryModel u){  
	String hql = "select o.uuid,o.name from UserModel o where 1=1 and o.uuid=:uuid";  
	        Query q = em.createQuery(hql);  
	        q.setParameter("uuid", u.getUuid());          
	        q.setFirstResult(0);  
	        q.setMaxResults(1);       
	Page<Object[]> page = new PageImpl<Object[]>(q.getResultList(),new PageRequest(0,1),3);   
	        return page;  
	}
	*/
	 
	 public List<User> ListAllUsersCus() {
		 
		 String hql = "select u from User u";
		 Query q = em.createQuery(hql, User.class);
		 List<User> us = q.getResultList();
			//List<User> users = em.createQuery(jpaq1, User.class).getResultList();
		 return us;

		 
		 
	 }
}
