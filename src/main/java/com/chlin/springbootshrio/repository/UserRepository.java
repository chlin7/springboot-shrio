package com.chlin.springbootshrio.repository;

import com.chlin.springbootshrio.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ desc：
 * @ Author     ：chenhl01.
 * @ Date       ：Created in 9:53 2019/7/18
 */
public interface UserRepository extends JpaRepository<User, Integer> {
	User findByUserName(String userName);
}
