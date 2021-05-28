package board.service;

import java.sql.Connection;
import java.util.List;

import board.domain.BoardVO;
import board.persistence.BoardDAO;

import static board.persistence.JDBCUtil.*;

public class BoardViewService {
	// read()
	public BoardVO read(int bno) {
		
		Connection con = getConnection();
		BoardDAO dao = new BoardDAO(con);
						
		// 내용 가져오기
		BoardVO vo = dao.getRow(bno); 
		close(con);
		return vo;
	}
	
}
