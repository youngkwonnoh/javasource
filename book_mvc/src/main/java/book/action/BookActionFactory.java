package book.action;

public class BookActionFactory {
	private static BookActionFactory factory;
	private BookActionFactory() {}
	
	public static BookActionFactory getInstance() {
		if(factory == null) {
			factory = new BookActionFactory();
		}
		return factory;
	}
	
	public Action action(String cmd) {
		Action action = null;
		
		if(cmd.equals("/list.do")) {
			action = new BookListAction("list.jsp");
		} else if(cmd.equals("/insert.do")) {
			action = new BookInsertAction("/list.do");
		} else if(cmd.equals("/delete.do")) {
			action = new BookDeleteAction("/list.do");
		}
		
		return action;
	}
}
