package member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lombok.AllArgsConstructor;
import member.service.MemberLeaveService;

@AllArgsConstructor
public class MemberLeaveAction implements Action {
	
	private String path;
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// 가져오기
		String userid = request.getParameter("userid");
		String currentPassword = request.getParameter("current_password");
		
		// 서비스
		MemberLeaveService service = new MemberLeaveService();
		boolean removeFlag = service.leave(userid, currentPassword);
		
		if(removeFlag) {
			HttpSession session = request.getSession();
			session.removeAttribute("loginVO");
		} else {
			path = "/view/leaveForm.jsp";
		}
		// ActionForward
		return new ActionForward(path, true);
	}

}
