package lombok;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
// 어노테이션을 사용하려면 정의되어있는 요소가 필요.
// 일반 java 클래스가 아닌 lombok.jar에 들어있음.
// 프로젝트의 build path에서 Classpath에 추가해주어야 한다.
public class Member {
	private String id;
	private String name;
	private String demail;
	private int age;
	private String addr;

}
