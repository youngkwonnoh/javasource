package board.action;

import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.domain.BoardVO;
import board.service.BoardReplyService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BoardReplyAction implements Action {
	
	private String path;
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		BoardVO vo = new BoardVO();
		// 댓글 정보
		vo.setName(request.getParameter("name"));
		vo.setTitle(request.getParameter("title"));
		vo.setContent(request.getParameter("content"));
		vo.setPassword(request.getParameter("password"));
		// 부모 정보
		int re_ref = Integer.parseInt(request.getParameter("re_ref"));
		int re_seq = Integer.parseInt(request.getParameter("re_seq"));
		int re_lev = Integer.parseInt(request.getParameter("re_lev"));
		vo.setRe_ref(re_ref);
		vo.setRe_seq(re_seq);
		vo.setRe_lev(re_lev);
		int bno = Integer.parseInt(request.getParameter("bno"));
		
		// 페이지 나누기 정보
		int page = Integer.parseInt(request.getParameter("page"));
		String criteria = request.getParameter("criteria");
		String keyword = URLEncoder.encode(request.getParameter("keyword"), "utf-8");
		
		BoardReplyService service = new BoardReplyService();
		boolean replyFlag = service.reply(vo);
		
		if(!replyFlag) {
			path = "/qReplyView.do?bno=" + bno + "&page=" + page + "&criteria=" + criteria + "&keyword=" + keyword;
		} else {
			path += "?page=" + page + "&criteria=" + criteria + "&keyword=" + keyword;
		}	
		
		return new ActionForward(path, true);
	}

}
