package ch14;

public class BoxEx3 {
	public static void main(String[] args) {
		Box3<Fruit> fruitBox = new Box3<Fruit>();
		Box3<Apple> appleBox = new Box3<Apple>();
		Box3<Toy> toyBox = new Box3<Toy>();
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		fruitBox.add(new Apple());
		
		appleBox.add(new Apple());
//		appleBox.add(new Grape()); // 관계가 없기때문에 add 불가
	}

}
