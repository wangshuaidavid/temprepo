package cn.enn.rd.HomeEnergyControlLite.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.enn.rd.HomeEnergyControlLite.entity.Role;
import cn.enn.rd.HomeEnergyControlLite.entity.User;
import cn.enn.rd.HomeEnergyControlLite.repository.UserDao;
import cn.enn.rd.HomeEnergyControlLite.repository.UserRepository;

@Service
@Transactional

public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserDao userDao;
	
	public List<User> findAlltest() {
		return userRepository.ListAllUsersCus();
	}
	
	public List<User> findAll() {
		return userRepository.findAllAll();
	}
	
	public User findUser(Integer id) {
		
		User u = userRepository.getOne(id);
		return u;
	}
	
public User findUserByDao(Integer id) {
		
		User u = userDao.getFirstUser();
		return u;
	}

public Role findRoles() {
	
	Role r = userRepository.findAllRole().get(0);
	return r;
}
}
