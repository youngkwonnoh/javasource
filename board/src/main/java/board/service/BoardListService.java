package board.service;

import java.sql.Connection;
import java.util.List;

import javax.servlet.RequestDispatcher;

import board.domain.BoardVO;
import board.domain.SearchVO;
import board.persistence.BoardDAO;

import static board.persistence.JDBCUtil.*;

public class BoardListService {
	public List<BoardVO> list(SearchVO search) {
		Connection con = getConnection();
		BoardDAO dao = new BoardDAO(con);
		List<BoardVO> list = dao.getList(search);
		
		// 전체 게시물 수
		int total = dao.totalRows(search.getCriteria(), search.getKeyword());
		close(con);
		
		return list;
	}
}
