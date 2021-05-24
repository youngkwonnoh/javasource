package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.InsertService;

public class InsertAction implements Action {

	private String path;
	
	public InsertAction(String path) {
		this.path = path;
	}

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String num1 = request.getParameter("num1");
		
		// 서비스 작업
		InsertService service = new InsertService();
		boolean result = service.insertService(num1);

		// insert true => index.jsp
		if(!result) {
			path = "insert.jsp";
		}
		
		return new ActionForward(path, false);
	}

}
