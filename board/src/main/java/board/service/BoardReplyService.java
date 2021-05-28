package board.service;

import static board.persistence.JDBCUtil.*;

import java.sql.Connection;

import board.domain.BoardVO;
import board.persistence.BoardDAO;

public class BoardReplyService {
	// reply()
	public boolean reply(BoardVO vo) {
		boolean replyFlag = false;
		
		Connection con = getConnection();
		BoardDAO dao = new BoardDAO(con);
		
		int result = dao.replyInsert(vo);
		
		if(result > 0) {
			replyFlag = true;
			commit(con);
		} else {
			rollback(con);
		}
		close(con);
		return replyFlag;
	}
}
