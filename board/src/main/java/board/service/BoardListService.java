package board.service;

import java.sql.Connection;
import java.util.List;

import board.domain.BoardVO;
import board.persistence.BoardDAO;

import static board.persistence.JDBCUtil.*;

public class BoardListService {
	public List<BoardVO> list() {
		Connection con = getConnection();
		BoardDAO dao = new BoardDAO(con);
		List<BoardVO> list = dao.getList();
		
		close(con);
		
		return list;
	}
}
