package board.action;

public class BoardActionFactory {
	
	private static BoardActionFactory factory;
	private BoardActionFactory() {}
	
	public static BoardActionFactory getInstance() {
		if(factory == null) {
			factory = new BoardActionFactory();
		}
		return factory;
	}
	
	public Action action(String cmd) {
		Action action = null;
		
		if(cmd.equals("/qWrite.do")) {
			action = new BoardInsertAction("/qList.do");
		} else if(cmd.equals("/qList.do")) {
			action = new BoardListAction("view/qna_board_list.jsp");
		} else if(cmd.equals("/qView.do")) {
			action = new BoardViewAction("view/qna_board_view.jsp");
		} else if(cmd.equals("/qRemove.do")) {
			action = new BoardRemoveAction("/qList.do");
		} else if(cmd.equals("/qModify.do")) {
			action = new BoardViewAction("view/qna_board_modify.jsp");
		}
		
		return action;
	}
}
