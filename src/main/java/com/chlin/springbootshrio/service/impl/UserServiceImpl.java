package com.chlin.springbootshrio.service.impl;

import com.chlin.springbootshrio.entity.User;
import com.chlin.springbootshrio.repository.UserRepository;
import com.chlin.springbootshrio.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ desc：
 * @ Author     ：chenhl01.
 * @ Date       ：Created in 10:09 2019/7/18
 */
@Service
public class UserServiceImpl implements IUserService {

	@Resource
	private UserRepository userRepository;

	@Override
	public User findByUserName(String userName) {
		return userRepository.findByUserName(userName);
	}

}
