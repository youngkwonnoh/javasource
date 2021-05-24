package book.service;

import java.sql.Connection;
import java.util.List;

import book.domain.BookVO;
import book.persistence.BookDAO;

import static book.persistence.JDBCUtil.*;

public class BookListService {
	public List<BookVO> list() {
		Connection con = getConnection();
		BookDAO dao = new BookDAO(con);
		List<BookVO> list = dao.getList();
		
		close(con);
		
		return list;
	}
}
