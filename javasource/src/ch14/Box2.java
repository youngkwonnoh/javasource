package ch14;

// Box1 클래스를 Generics 적용 후
// Generics : 다양한 타입의 객체들을 다루는 메소드나 컬렉션 클래스에 컴파일 시 타입을 체크해준다.
// 타입 안정성 / 타입 체크와 혀연환을 생략할 수 있으므로 코드가 간결해진다.

// T : type / E : element / K : key : V : value

public class Box2<T> {
	// 기본타입
	// 참조타임 => Account, Car..., Integer, Float
	// Object : 모든 클래스들의 부모. 타입의 Object를 넣으면 모든 클래스 타입을 처리한다는 의미
	// 부모 = 자식, Object item = 자식
	private T item;
		public T getItem() {
		return item;
	}
	public void setItem(T item) {
		this.item = item;
	}

}
