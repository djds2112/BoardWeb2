package com.ezen.biz.dao;

import java.sql.*;

import org.springframework.stereotype.Repository;

import com.ezen.biz.dto.UserVO;

@Repository("userDAO")   // (2) 어노테이션 방식으로 객체 생성시
public class UserDAO {
	
	public UserVO getUser(UserVO vo) {
		UserVO user = null;
		
		return user;
	}
	
}
