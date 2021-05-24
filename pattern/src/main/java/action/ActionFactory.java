package action;

public class ActionFactory {
	
	// singleton => 객체는 무조건 하나만 생성
	private static ActionFactory factory;
	
	private ActionFactory() {}
	public static ActionFactory getInstacne() {
		if(factory == null) {
			factory = new ActionFactory();
		}
		return factory;
	}
	
	Action action = null;
	public Action action(String cmd) {
		if(cmd.equals("/insert.do")) {
			action = new InsertAction("index.jsp");
		} else if(cmd.equals("/delete.do")) {
			action = new DeleteAction("index.jsp");
		} else if(cmd.equals("/login.do")) {
			action = new LoginAction("index.jsp");
		}
		return action;
	}
}
