package board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.domain.BoardVO;
import board.service.BoardViewService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BoardViewAction implements Action {
	
	private String path; // view/qna_board_view.jsp
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// 가져오기
		int bno = Integer.parseInt(request.getParameter("bno"));
		BoardViewService service = new BoardViewService();
		BoardVO vo = service.read(bno);
		
		request.setAttribute("vo", vo);
		
		return new ActionForward(path, false);
	}

}
