package cn.enn.rd.HomeEnergyControlLite.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import cn.enn.rd.HomeEnergyControlLite.entity.User;

@Repository
public class UserDaoImpl implements UserDao {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public User getFirstUser() {
		String jpaq1 = "SELECT u FROM User u";
		List<User> users = em.createQuery(jpaq1, User.class).getResultList();
		
		return users.get(0);
	}

}
