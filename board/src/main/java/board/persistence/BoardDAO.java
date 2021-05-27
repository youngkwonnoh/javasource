package board.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import board.domain.BoardVO;

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
	public List<BoardVO> getList() {
		List<BoardVO> list = new ArrayList<BoardVO>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "select bno, title, name, regdate, readcount from board order by bno desc";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				BoardVO vo = new BoardVO();
				vo.setBno(rs.getInt("bno"));
				vo.setTitle(rs.getString("title"));
				vo.setName(rs.getString("name"));
				vo.setRegdate(rs.getDate("regdate"));
				vo.setReadcount(rs.getInt("readcount"));
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
			String sql = "select bno, name, title, content, attach from board where bno=?";
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
			}
		} catch (SQLException e) {
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
	
}
