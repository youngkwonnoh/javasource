package board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardResizeToggleHandler;

import board.service.BoardRemoveService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BoardRemoveAction implements Action {

	private String path;
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int bno = Integer.parseInt(request.getParameter("bno")); 
		String password = request.getParameter("password"); 
		
		BoardRemoveService service = new BoardRemoveService();
		boolean deleteFlag = service.delete(bno, password);
		
		if(!deleteFlag) {
			path = "view/qna_board_pwdCheck.jsp?bno=" + bno;
		}
		
		return new ActionForward(path, true);
	}

}
