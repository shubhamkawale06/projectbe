package com.dummyproject.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dummyproject.app.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	@Query(value = "select * from tbl_user where user_name = :userName and user_password = :passWord" ,nativeQuery = true)
	public User findByUserName(@Param(value = "userName") String userName,
			@Param(value = "passWord") String passWord);

}
