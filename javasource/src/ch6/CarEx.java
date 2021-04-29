package ch6;

//public 사라지면 기본형이 보안이 높은 수준이기 때문에
import ch5.Car;
import ch5.Student;

public class CarEx {
	public static void main(String[] args) {
		Car car = new Car();
		Student student = new Student();
		
		//초기화를 위해서 생성자를 반드시 동원해야함
		//같은패키지 내에서는 클래스에 붙은 접근제한자는 상관없음
		Account account = new Account("122-12","홍길동",1000);		
		//account.name="홍길동";
		//계좌번호를 확인해보고 싶음
		System.out.println("계좌번호 확인 "+account.getAno());
		System.out.println("잔액 확인 "+account.getBalance());
		
	}
}
