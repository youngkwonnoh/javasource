package ch9;

public abstract class Animal {
	String kind;
	void breath() {
		System.out.println("숨을 쉰다.");
	}
	// 주석을 통해서 어떤 기능을 수행할 목적으로 작성했는지 설명
	abstract void sound();
}
