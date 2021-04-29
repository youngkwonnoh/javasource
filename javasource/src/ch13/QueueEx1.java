package ch13;

import java.util.LinkedList;
import java.util.Queue;

/* Queue
 * 처음에 저장한 데이터를 가장 먼저 꺼내는 FIFO 구조
 * 
 * offer(삽입), poll(나올 떄)
 * 
 * 최근 사용문서 / 버퍼 / 인쇄 작업 대기목록
 * 
 */

public class QueueEx1 {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		
		queue.offer("박보검");
		queue.offer("송중기");
		queue.offer("조인성");
		queue.offer("송민호");
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}

}
