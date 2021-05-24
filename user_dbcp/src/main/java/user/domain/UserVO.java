package user.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class UserVO {
	// userTBL 담을 구조
	private int no;
	private String username;
	private int birthyear;
	private String addr;
	private String mobile;
	
	
	
}
