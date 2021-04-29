package ch14;

import java.util.ArrayList;

public class Box3<T> {

	
	ArrayList<T> list = new ArrayList<T>();
	
	public T get(int i) {
		return list.get(i);
	}
		
	public void add(T item) {
		list.add(item);
	}
	
	public int size() {
		return list.size();
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

}
