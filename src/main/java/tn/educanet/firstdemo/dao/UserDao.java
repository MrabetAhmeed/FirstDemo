package tn.educanet.firstdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.educanet.firstdemo.persistence.User;

@Repository
public interface UserDao extends CrudRepository<User, Long>,JpaRepository<User, Long>{
	
	User findByBarreCode(String barreCode);

}
