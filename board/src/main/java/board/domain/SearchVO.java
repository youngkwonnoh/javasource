package board.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SearchVO {
	private String criteria;
	private String keyword;
	
	// 페이지 나누기
	private int page; // 현재 페이지 번호
	private int amount; // 페이지 당 게시물 수
	
	public SearchVO(int page, int amount) {
		super();
		this.page = page;
		this.amount = amount;
	}
	
	
}
