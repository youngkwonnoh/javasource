package member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.AllArgsConstructor;
import member.service.MemberCheckIdService;

@AllArgsConstructor
public class MemberCheckIdAction implements Action {
	
	private String path;	
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String userid = request.getParameter("userid");
		
		// System.out.println(userid);
		MemberCheckIdService service = new MemberCheckIdService();
		boolean dupFlag = service.dupId(userid);
		
		if(dupFlag) {
			request.setAttribute("dupId", "true");
		} else {
			request.setAttribute("dupId", "false");
		}
		
		return new ActionForward(path, false);
	}

}
