package board.action;

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
		
		BoardReplyService service = new BoardReplyService();
		boolean replyFlag = service.reply(vo);
		
		if(!replyFlag) {
			path = "view/qna_board_reply.jsp?re_ref=" + re_ref + "&re_seq=" + re_seq + "&re_lev=" + re_lev;
		}
		
		return new ActionForward(path, true);
	}

}
