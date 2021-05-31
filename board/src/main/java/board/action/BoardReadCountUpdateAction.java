package board.action;

import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.service.BoardReadCountUpdateService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BoardReadCountUpdateAction implements Action {
	
	private String path; //qView.do
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		int bno = Integer.parseInt(request.getParameter("bno"));
		
		// 페이지 나누기 후 추가
		int page = Integer.parseInt(request.getParameter("page"));
		String criteria = request.getParameter("criteria");
		String keyword = URLEncoder.encode(request.getParameter("keyword"), "utf-8");
		
		
		BoardReadCountUpdateService service = new BoardReadCountUpdateService();
		boolean countFlag = service.readCountUpdate(bno);
		
		if(!countFlag) {
			path = "/qList.do?page=" + page + "&criteria=" + criteria + "&keyword=" + keyword;
		} else {
			path += "?bno="+ bno + "&page=" + page + "&criteria=" + criteria + "&keyword=" + keyword;
		}
		
		return new ActionForward(path, true);
	}

}
