package board.service;

import java.sql.Connection;

import board.persistence.BoardDAO;

import static board.persistence.JDBCUtil.*;
public class BoardTotalRowService {
	public int total(String criteria, String keyword) {
		Connection con = getConnection();
		BoardDAO dao = new BoardDAO(con);
		int total = dao.totalRows(criteria, keyword);
		
		close(con);
		
		return total;
	}
}
