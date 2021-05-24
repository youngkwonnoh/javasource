package user.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.AllArgsConstructor;
import user.domain.UserVO;
import user.service.UserListService;

@AllArgsConstructor
public class ListAction implements Action {
	private String path;
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// 전체 리스트를 요청 => 처리
		// service
		UserListService service = new UserListService();
		List<UserVO> list = service.list();
		
		request.setAttribute("list", list);
		
		return new ActionForward(path, false);
	}

}
