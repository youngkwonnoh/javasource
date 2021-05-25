package book.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import book.service.BookModifyService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BookModifyAction implements Action {
	
	private String path;
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// 가져오기
		int code = Integer.parseInt(request.getParameter("code"));
		int price = Integer.parseInt(request.getParameter("price"));
		// 서비스
		BookModifyService service = new BookModifyService();
		boolean modifyFlag = service.BookModify(code, price);
		
		if(!modifyFlag) {
			path = "index.jsp";
		} 
		// ActionForward
		return new ActionForward(path, false);
	}

}
