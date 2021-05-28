package board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.service.BoardReadCountUpdateService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BoardReadCountUpdateAction implements Action {
	
	private String path; //qView.do
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		int bno = Integer.parseInt(request.getParameter("bno"));
		
		BoardReadCountUpdateService service = new BoardReadCountUpdateService();
		boolean countFlag = service.readCountUpdate(bno);
		
		if(!countFlag) {
			path = "/qList.do";
		} else {
			path += "?bno="+bno;
		}
		
		return new ActionForward(path, true);
	}

}
