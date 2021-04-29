package ch13;

import java.util.Stack;

/* Stack
 * 마지막에 저장한 데이터를 가장 먼저 꺼내는 LIFO 구조
 * 
 * pop : 객체를 꺼낼 떄
 * push : 객체를 넣을 때 
 * 
 * 수식계산, 수식 괄호 검사, 워드 프로세서 undo/redo
 * 웹브라우저 뒤로 / 앞으로
 */

public class StackEx1 {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		stack.push("사과");
		stack.push("딸기");
		stack.push("바나나");
		stack.push("수박");
		
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
		
		
		
		
		
	}

}
