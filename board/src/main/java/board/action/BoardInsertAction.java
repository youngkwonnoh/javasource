package board.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.domain.BoardVO;
import board.service.BoardInsertService;
import board.util.FileUploadUtil;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BoardInsertAction implements Action {
	
	private String path;
		
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		FileUploadUtil util = new FileUploadUtil();
		Map<String, String> dataMap = util.uploadFile(request);
		
		BoardVO vo = new BoardVO();
		vo.setName(dataMap.get("name"));
		vo.setTitle(dataMap.get("title"));
		vo.setContent(dataMap.get("content"));
		vo.setPassword(dataMap.get("password"));
		if(dataMap.containsKey("attach"))
			vo.setAttach(dataMap.get("attach"));
				
		
		// 가져오기
//		BoardVO vo = new BoardVO();
//		vo.setName(request.getParameter("name"));
//		vo.setTitle(request.getParameter("title"));
//		vo.setContent(request.getParameter("content"));
//		vo.setPassword(request.getParameter("password"));
//		vo.setAttach(request.getParameter("attach"));
		
		// 서비스 작업
		BoardInsertService service = new BoardInsertService();
		boolean insertFlag = service.insertArticle(vo);
		
		if(!insertFlag) {
			path = "view/qna_board_write.jsp";
		}
		
		// ActionForward 리턴
		return new ActionForward(path, true);
	}

}
