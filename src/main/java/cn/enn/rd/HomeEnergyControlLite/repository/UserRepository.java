package cn.enn.rd.HomeEnergyControlLite.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.enn.rd.HomeEnergyControlLite.entity.User;;

public interface UserRepository extends JpaRepository<User, Integer> {

	
}
