package board.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PageVO {
	private int startPage;
	private int endPage;
	private boolean prev; 
	private boolean next;
	
	private SearchVO search;
	private int total;
	
	public PageVO(int total, SearchVO search) {
		this.total = total;
		this.search = search;
		
		endPage = (int)(Math.ceil(search.getPage()/10.0)) * 10;
		startPage = endPage - 9;
		
		int realEnd = (int)(Math.ceil((total/1.0) / search.getAmount()));
		
		if(realEnd < this.endPage) {
			this.endPage = realEnd;
		}
		this.prev = this.startPage > 1;
		this.next = this.endPage < realEnd;
	}
	
}
