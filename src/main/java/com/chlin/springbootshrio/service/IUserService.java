package com.chlin.springbootshrio.service;

import com.chlin.springbootshrio.entity.User;

/**
 * @ desc：
 * @ Author     ：chenhl01.
 * @ Date       ：Created in 9:59 2019/7/18
 */
public interface IUserService {
	User findByUserName(String userName);
}
