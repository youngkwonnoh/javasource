package board.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.domain.BoardVO;
import board.service.BoardUpdateService;
import board.util.FileUploadUtil;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BoardUpdateAction implements Action {
	
	private String path;
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		FileUploadUtil util = new FileUploadUtil();
		Map<String, String> dataMap = util.uploadFile(request);
		
		BoardVO vo = new BoardVO();
		vo.setTitle(dataMap.get("title"));
		vo.setContent(dataMap.get("content"));
		if(dataMap.containsKey("attach"))
			vo.setAttach(dataMap.get("attach"));
		
		BoardUpdateService service = new BoardUpdateService();
		boolean updateFlag = service.update(vo);
		
		if(!updateFlag) {
			path = "view/qna_board_modify.jsp";
		}
		
		return new ActionForward(path, true);
	}

}
