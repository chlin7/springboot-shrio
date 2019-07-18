package com.chlin.springbootshrio.service;

import com.chlin.springbootshrio.dto.LoginResult;

/**
 * @ desc：
 * @ Author     ：chenhl01.
 * @ Date       ：Created in 10:01 2019/7/18
 */
public interface ILoginService {
	LoginResult login(String userName, String password);
	void logout();
}
