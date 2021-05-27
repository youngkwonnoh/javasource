package board.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.domain.BoardVO;
import board.service.BoardListService;
import lombok.AllArgsConstructor;
@AllArgsConstructor
public class BoardListAction implements Action {
	
	private String path;
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		BoardListService service = new BoardListService();
		List<BoardVO> list = service.list();
		
		request.setAttribute("list", list);
		return new ActionForward(path, false);
	}

}
