package board.action;

import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.service.BoardRemoveService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BoardRemoveAction implements Action {

	private String path;
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int bno = Integer.parseInt(request.getParameter("bno")); 
		String password = request.getParameter("password"); 
		
		// 페이지 나누기 후 추가
		int page = Integer.parseInt(request.getParameter("page"));
		String criteria = request.getParameter("criteria");
		String keyword = URLEncoder.encode(request.getParameter("keyword"), "utf-8");
		// String keyword = request.getParameter("keyword");
		
		
		BoardRemoveService service = new BoardRemoveService();
		boolean deleteFlag = service.delete(bno, password);
		
		if(!deleteFlag) {
			path = "view/qna_board_pwdCheck.jsp?bno=" + bno + "&page=" + page + "&criteria=" + criteria + "&keyword=" + keyword;
		} else {
			path += "?&page=" + page + "&criteria=" + criteria + "&keyword=" + keyword;
		}
		
		return new ActionForward(path, true);
	}

}
