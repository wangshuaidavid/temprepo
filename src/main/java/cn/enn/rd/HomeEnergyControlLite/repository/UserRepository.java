package cn.enn.rd.HomeEnergyControlLite.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import cn.enn.rd.HomeEnergyControlLite.entity.Role;
import cn.enn.rd.HomeEnergyControlLite.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	@Query("select o from User o")
	public List<User> findAllAll();
	
	@Query("select r from Role r")
	List<Role> findAllRole();
	
	public List<User> ListAllUsersCus();

}
