package board.service;

import java.sql.Connection;
import java.util.List;
import static board.persistence.JDBCUtil.*;
import board.domain.BoardVO;
import board.persistence.BoardDAO;

public class BoardSearchService {
	// search()
	public List<BoardVO> search(String criteria, String keyword) {
		Connection con = getConnection();
		BoardDAO dao = new BoardDAO(con);
		
		List<BoardVO> list = dao.searchList(criteria, keyword);
		
		close(con);
		return list;
	}
}
