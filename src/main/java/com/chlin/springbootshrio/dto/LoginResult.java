package com.chlin.springbootshrio.dto;

import lombok.Data;

/**
 * @ desc：
 * @ Author     ：chenhl01.
 * @ Date       ：Created in 10:01 2019/7/18
 */
@Data
public class LoginResult {
	private boolean isLogin = false;
	private String result;
}
