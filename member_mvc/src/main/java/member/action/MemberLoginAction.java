package member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lombok.AllArgsConstructor;
import member.domain.MemberVO;
import member.service.MemberLoginService;
@AllArgsConstructor
public class MemberLoginAction implements Action {
	
	private String path; // loginForm.jsp
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// 가져오기
		String userid = request.getParameter("userid");
		String currentPassword = request.getParameter("current_password");
		// 서비스
		MemberLoginService service = new MemberLoginService();
		MemberVO login = service.login(userid, currentPassword);
		
		HttpSession session = request.getSession();
		session.setAttribute("loginVO", login);
		
		// ActionForward
		return new ActionForward(path, true);
	}

}
