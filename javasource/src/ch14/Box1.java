package ch14;

public class Box1 {
	// 기본타입
	// 참조타임 => Account, Car..., Integer, Float
	// Object : 모든 클래스들의 부모. 타입의 Object를 넣으면 모든 클래스 타입을 처리한다는 의미
	// 부모 = 자식, Object item = 자식
	private Object item;

	public Object getItem() {
		return item;
	}

	public void setItem(Object item) {
		this.item = item;
	}
	
	
	
}
