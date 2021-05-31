package board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.domain.BoardVO;
import board.domain.SearchVO;
import board.service.BoardViewService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BoardViewAction implements Action {
	
	private String path; //qna_board_view.jsp
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// 가져오기
		int bno = Integer.parseInt(request.getParameter("bno"));
		
		// 페이지 나누기 후 추가
		int page = Integer.parseInt(request.getParameter("page"));
		String criteria = request.getParameter("criteria");
		String keyword = request.getParameter("keyword");
		
		SearchVO search = new SearchVO();
		search.setPage(page);
		search.setCriteria(criteria);
		search.setKeyword(keyword);
	
		BoardViewService service = new BoardViewService();
		BoardVO vo = service.read(bno);
		
		request.setAttribute("vo", vo);
		request.setAttribute("searchVO", search);
		
		return new ActionForward(path, false);
	}

}
