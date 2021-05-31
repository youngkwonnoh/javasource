package board.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import board.domain.BoardVO;
import board.domain.SearchVO;

import static board.persistence.JDBCUtil.*;

public class BoardDAO {
	private Connection con;
	
	public BoardDAO(Connection con) {
		this.con = con;
	}
	
	public int insert(BoardVO vo) {
		int result = 0;
		PreparedStatement pstmt = null;
		try {
			String sql = "insert into board(bno, name, password, title, content, attach, re_ref, re_lev, re_seq) ";
			sql += "values(board_seq.nextval,?,?,?,?,?,board_seq.currval,0,0)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getPassword());
			pstmt.setString(3, vo.getTitle());
			pstmt.setString(4, vo.getContent());
			pstmt.setString(5, vo.getAttach());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}
	
	// 게시글 전체 가져오기 = getList()
	public List<BoardVO> getList(SearchVO search) {
		
		// 사용자가 누른 페이지 번호 * 한 페이지에 보여줄 게시물 수
		int start = search.getPage()*search.getAmount();
		// (사용자가 누른 페이지번호 - 1) * 한 페이지에 보여줄 게시물 수 
		int limit = (search.getPage()-1)*search.getAmount();
		
		List<BoardVO> list = new ArrayList<BoardVO>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			// 페이지 나누기 전
			// String sql = "select bno, title, name, regdate, readcount, re_lev from board order by re_ref desc, re_seq asc";
			StringBuilder sql = new StringBuilder();
			
			if(!search.getCriteria().isEmpty()) { // 검색 리스트 요청
				sql.append("select rnum, bno, title, name, regdate, readcount, re_lev ");
				sql.append("from(select rownum rnum, A.* ");
				sql.append("from(select bno, title, name, regdate, readcount, re_lev ");
				sql.append("from board ");
				sql.append("where " + search.getCriteria() + " like ? and bno > 0 order by re_ref desc, re_seq asc) A ");
				sql.append("where rownum <= ?) ");
				sql.append("where rnum > ?");
				
				pstmt = con.prepareStatement(sql.toString());
				pstmt.setString(1, "%" + search.getKeyword() + "%");
				pstmt.setInt(2, start);
				pstmt.setInt(3, limit);
			} else { // 일반 리스트 요청
				sql.append("select rnum, bno, title, name, regdate, readcount, re_lev ");
				sql.append("from(select rownum rnum, A.* ");
				sql.append("from(select bno, title, name, regdate, readcount, re_lev ");
				sql.append("from board ");
				sql.append("where bno > 0 order by re_ref desc, re_seq asc) A ");
				sql.append("where rownum <= ?) ");
				sql.append("where rnum > ?");
				
				pstmt = con.prepareStatement(sql.toString());
				pstmt.setInt(1, start);
				pstmt.setInt(2, limit);
			}
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				BoardVO vo = new BoardVO();
				vo.setBno(rs.getInt("bno"));
				vo.setTitle(rs.getString("title"));
				vo.setName(rs.getString("name"));
				vo.setRegdate(rs.getDate("regdate"));
				vo.setReadcount(rs.getInt("readcount"));
				vo.setRe_lev(rs.getInt("re_lev"));
				list.add(vo);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}
		return list;
	}
	
	// 게시글 하나 가져오기 getRow()
	public BoardVO getRow(int bno) {
		BoardVO vo = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			String sql = "select bno, name, title, content, attach, re_ref, re_seq, re_lev from board where bno=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bno);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				vo = new BoardVO();
				vo.setBno(rs.getInt("bno"));
				vo.setName(rs.getString("name"));
				vo.setTitle(rs.getString("title"));
				vo.setContent(rs.getString("content"));
				vo.setAttach(rs.getString("attach"));
				// reply 필요한 정보
				vo.setRe_ref(rs.getInt("re_ref"));
				vo.setRe_seq(rs.getInt("re_seq"));
				vo.setRe_lev(rs.getInt("re_lev"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}
		return vo;
	}
	// 게시글 삭제 delete()
	public int delete(int bno, String password) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		try {
			String sql = "delete from board where bno=? and password=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bno);
			pstmt.setString(2, password);
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;
	}
	
	// update()
	// 새로운 제목, 새로운 내용, 새로운 첨부파일, bno, password
	public int update(BoardVO vo) {
		int result = 0;
		PreparedStatement pstmt = null;
		try {
			String sql = "";
			
			if(vo.getAttach()!=null) {
				sql = "update board set title=?,content=?, attach=? where bno=? and password=?"; 
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, vo.getTitle());
				pstmt.setString(2, vo.getContent());
				pstmt.setString(3, vo.getAttach());
				pstmt.setInt(4, vo.getBno());
				pstmt.setString(5, vo.getPassword());
			} else {
				sql = "update board set title=?,content=? where bno=? and password=?"; 
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, vo.getTitle());
				pstmt.setString(2, vo.getContent());
				pstmt.setInt(3, vo.getBno());
				pstmt.setString(4, vo.getPassword());
			}
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;
	}
	
	// replyInsert()
	public int replyInsert(BoardVO vo) {
		int result = 0;
		PreparedStatement pstmt = null;
		try {
			String sql = "update board set re_seq = re_seq + 1 where re_ref=? and re_seq>?";

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, vo.getRe_ref());
			pstmt.setInt(2, vo.getRe_seq());
			
			pstmt.executeUpdate();
			commit(con);
			close(pstmt);
			
			sql = "insert into board(bno, name, password, title, content, attach, re_ref, re_seq, re_lev)";
			sql += "values(board_seq.nextval, ?, ?, ?, ?, null, ?, ?, ?)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getPassword());
			pstmt.setString(3, vo.getTitle());
			pstmt.setString(4, vo.getContent());
			pstmt.setInt(5, vo.getRe_ref());
			pstmt.setInt(6, vo.getRe_seq()+1);
			pstmt.setInt(7, vo.getRe_lev()+1);
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}
	
	// 조회수 업데이트
	// readCountUpdate()
	public int readCountUpdate(int bno) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		try {
			String sql = "update board set readcount = readcount + 1 where bno = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bno);
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;
	}
	
	// searchList() => like => like % 페이지 나누기 전
//	public List<BoardVO> searchList(String criteria, String keyword) {
//		List<BoardVO> list = new ArrayList<BoardVO>();
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		try {
//			String sql = "select bno, title, name, regdate, readcount, re_lev from board ";
//			sql += "where "+ criteria + " like ? order by re_ref desc, re_seq asc";
//			
//			pstmt = con.prepareStatement(sql);
//			pstmt.setString(1, "%" + keyword + "%");
//			rs = pstmt.executeQuery();
//			
//			while(rs.next()) {
//				BoardVO vo = new BoardVO();
//				vo.setBno(rs.getInt("bno"));
//				vo.setTitle(rs.getString("title"));
//				vo.setName(rs.getString("name"));
//				vo.setRegdate(rs.getDate("regdate"));
//				vo.setReadcount(rs.getInt("readcount"));
//				vo.setRe_lev(rs.getInt("re_lev"));
//				list.add(vo);
//			}
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			close(rs);
//			close(pstmt);
//		}
//		return list;
//	}
	
	// 전체 게시물 수 구하기 + 검색 게시물 수
	public int totalRows(String criteria, String keyword) {
		String sql = "";
		int total = 0;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			if(!criteria.isEmpty()) { // 검색 리스트 요청 시
				sql = "select count(*) from board where " + criteria + " like ?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, "%" + keyword + "%");
			} else { // 일반 전체 리스트 요청 시
				sql = "select count(*) from board";
				pstmt = con.prepareStatement(sql);
			}
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				total = rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}
		return total;
	}
	
}
