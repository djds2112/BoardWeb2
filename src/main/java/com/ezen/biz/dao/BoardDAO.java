package com.ezen.biz.dao;

import java.util.*;

import org.apache.ibatis.session.SqlSession;

import com.ezen.biz.dto.BoardVO;
import com.ezen.biz.util.SqlSessionFactoryBean;

public class BoardDAO {
	
	private SqlSession mybatis; // 데이터베이스 연결 객체
	
	// 생성자
	public BoardDAO() {
		mybatis = SqlSessionFactoryBean.getSqlSessionInstance();
	}
	
	// 게시글 등록
	public void insertBoard(BoardVO board) {
		mybatis.insert("boardMapper.insertBoard", board);
		mybatis.commit();
	}
	
	// 게시글 수정
	public void updateBoard(BoardVO board) {
		mybatis.update("boardMapper.updateBoard", board);
	}
	
	// 게시글 삭제
	public void deleteBoard(BoardVO board) {
		mybatis.delete("boardMapper.deleteBoard", board);
	}
	
	// 게시글 상세 조회
	public BoardVO getBoard(BoardVO board) {
	
		return mybatis.selectOne("boardMapper.getBoard", board);
	}
	
	// 게시글 목록 조회
	public List<BoardVO> getBoardList(BoardVO board) {
		
		return mybatis.selectList("boardMapper.getBoardList", board);
	}
}












