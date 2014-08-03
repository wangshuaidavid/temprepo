package cn.enn.rd.HomeEnergyControlLite.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.enn.rd.HomeEnergyControlLite.entity.User;
import cn.enn.rd.HomeEnergyControlLite.repository.UserRepository;

@Service
@Transactional

public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	public User findUser(Integer id) {
		
		User u = userRepository.getOne(id);
		return u;
	}
}
