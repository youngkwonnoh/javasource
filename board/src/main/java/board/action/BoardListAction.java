package board.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.domain.BoardVO;
import board.domain.PageVO;
import board.domain.SearchVO;
import board.service.BoardListService;
import board.service.BoardTotalRowService;
import lombok.AllArgsConstructor;
@AllArgsConstructor
public class BoardListAction implements Action {
	
	private String path; //qna_board_list.jsp
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		// 사용자가 선택한 페이지
		int page = 1;
		if(request.getParameter("page")!=null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		
		String criteria = request.getParameter("criteria");
		String keyword = request.getParameter("keyword");
		
		// 한 페이지당 보여줄 게시물 수
		int amount = 10;
		
		SearchVO search = new SearchVO();
		search.setCriteria(criteria);
		search.setKeyword(keyword);
		search.setPage(page);
		search.setAmount(amount);
		
		
		// 전체 게시물 수 가져오기
		BoardTotalRowService rows = new BoardTotalRowService();
		int total = rows.total(criteria, keyword);
		
		PageVO pageVO = new PageVO(total, search);
		
		BoardListService service = new BoardListService();
		List<BoardVO> list = service.list(search);
		
		request.setAttribute("list", list);
		request.setAttribute("pageVO", pageVO);
		
		return new ActionForward(path, false);
	}

}
