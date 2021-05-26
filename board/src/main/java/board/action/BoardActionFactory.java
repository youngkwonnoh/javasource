package board.action;

public class BoardActionFactory {
	
	private static BoardActionFactory factory;
	
	public static BoardActionFactory getInstance() {
		if(factory == null) {
			factory = new BoardActionFactory();
		}
		return factory;
	}
	
	public Action action(String cmd) {
		Action action = null;
		
		return action;
	}
}
