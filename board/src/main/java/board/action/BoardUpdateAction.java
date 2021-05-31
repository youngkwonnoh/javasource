package board.action;

import java.net.URLEncoder;
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
		vo.setBno(Integer.parseInt(dataMap.get("bno")));
		vo.setTitle(dataMap.get("title"));
		vo.setContent(dataMap.get("content"));
		vo.setPassword(dataMap.get("password"));
		if(dataMap.containsKey("attach"))
			vo.setAttach(dataMap.get("attach"));
		
		// 페이지 나누기 후 추가
		int page = Integer.parseInt(dataMap.get("page"));
		String criteria = dataMap.get("criteria");
		String keyword = URLEncoder.encode(dataMap.get("keyword"), "utf-8");
		
		
		BoardUpdateService service = new BoardUpdateService();
		boolean updateFlag = service.update(vo);
		
		if(!updateFlag) {
			path = "/qModify.do?bno=" + dataMap.get("bno") + "&page=" + page + "&criteria=" + criteria + "&keyword=" + keyword;
		} else {
			path += "?page=" + page + "&criteria=" + criteria + "&keyword=" + keyword;
		}		
		return new ActionForward(path, true);
	}

}
