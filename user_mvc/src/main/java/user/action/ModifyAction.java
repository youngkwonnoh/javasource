package user.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.AllArgsConstructor;
import user.domain.UserVO;
import user.service.UserModifyService;
@AllArgsConstructor
public class ModifyAction implements Action {
	
	private String path; // modify.jsp
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// 가져오기
		int no = Integer.parseInt(request.getParameter("no"));
		
		// 서비스
		UserModifyService service = new UserModifyService();
		UserVO vo = service.modify(no);
		
		request.setAttribute("vo", vo);
		// 이동방식 결정 후 ActionForward 객체 생성
		return new ActionForward(path, false);
	}

}
