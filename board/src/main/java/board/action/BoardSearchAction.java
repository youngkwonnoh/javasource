package board.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.domain.BoardVO;
import board.domain.SearchVO;
import board.service.BoardSearchService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BoardSearchAction implements Action {
	
	private String path; // qna_board_list.jsp
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String criteria = request.getParameter("criteria");
		String keyword = request.getParameter("keyword");
		
		BoardSearchService service = new BoardSearchService();
		List<BoardVO> list = service.search(criteria, keyword);
		
		request.setAttribute("list", list);
		//request.setAttribute("searchVO", new SearchVO(criteria, keyword));
		
		return new ActionForward(path, false);
	}

}
