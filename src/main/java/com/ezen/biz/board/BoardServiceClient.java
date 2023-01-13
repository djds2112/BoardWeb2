package com.ezen.biz.board;

import com.ezen.biz.dao.BoardDAO;
import com.ezen.biz.dto.BoardVO;

public class BoardServiceClient {
	
	public static void main(String[] args) {
		
	
		BoardVO vo = new BoardVO();
		BoardDAO boardDao = new BoardDAO();
	
		vo.setTitle("Mybatis");
		vo.setWriter("유관순");
		vo.setContent("Mybatis를 이용한 MVC 구현");
		
		boardDao.insertBoard(vo);
	}
}
