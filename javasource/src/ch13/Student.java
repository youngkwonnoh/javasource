package ch13;

public class Student implements Comparable<Student> {
	
	private String name;
	private Integer java;
	
	
	public Student(String name, Integer java) {
		super();
		this.name = name;
		this.java = java;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name + " : " + java;
	}
	
	// 추상 인터페이스 구현 = Student가 가지고 있는 추상 메소드를 오버라이딩 해야 한다.
	
	@Override
	public int compareTo(Student o) { // 정렬기준
		// return this.name.compareTo(o.name); // 오름차순 
		// return o.name.compareTo(this.name); // 내림차순
		
		// java 점수 정렬
		return this.java.compareTo(o.java);
		
		
		
	}
	
	
}
