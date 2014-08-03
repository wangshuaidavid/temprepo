package cn.enn.rd.HomeEnergyControlLite.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.enn.rd.HomeEnergyControlLite.entity.Role;
import cn.enn.rd.HomeEnergyControlLite.entity.User;
import cn.enn.rd.HomeEnergyControlLite.repository.RoleRepository;
import cn.enn.rd.HomeEnergyControlLite.repository.UserRepository;

@Transactional
@Service
public class InitDBService {

	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@PostConstruct
	public void init(){
		
		Role roleAdmin = new Role();
		roleAdmin.setName("Admin");
		roleRepository.save(roleAdmin);
		
		Role roleUser = new Role();
		roleUser.setName("Role_User");
		roleRepository.save(roleUser);
	
		User userAdmin = new User();
		userAdmin.setName("zhang san");
		List<Role> roles = new ArrayList<Role>();
		roles.add(roleAdmin);
		roles.add(roleUser);
		userAdmin.setRoles(roles);
		userRepository.save(userAdmin);

		
	}
}
