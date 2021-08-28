package Question_SD_Re;
import java.util.*;
public class QueuePriority {

	/* 우선순위 */
	/*
	            1
	      3           2
	   7    9      6
	   
	   항상 1의 위치인 Top node 추출
	   
	   값을 추가할때 offer , add
	   값을 확인할때 peek
	   값을 추출할때 pool
	         
	 */
	public static void q1() {
		int n[] =new int[] {1, 3, 1, 10, 2, 12};
		
		//int형 priorityQueue 선언 (우선순위가 낮은 숫자 순)
		PriorityQueue<Integer> q1 = new PriorityQueue<>();

		//int형 priorityQueue 선언 (우선순위가 높은 숫자 순)
		PriorityQueue<Integer> q2 = new PriorityQueue<>(Collections.reverseOrder());
		
		for (int a : n) {
			q1.offer(a);
			q2.offer(a);
		}
		System.out.println(q1);
		System.out.println(q2);
		
		System.out.println(q1.peek());
		System.out.println(q2.peek());
		
		System.out.println(q1.poll());
		System.out.println(q2.poll());
		
		System.out.println(q1);
		System.out.println(q2);

	}
	
	public static void q2() {
		//String형 priorityQueue 선언 (우선순위가 낮은 숫자 순)
		PriorityQueue<String> q3 = new PriorityQueue<>(); 

		//String형 priorityQueue 선언 (우선순위가 높은 숫자 순)
		PriorityQueue<String> q4 = new PriorityQueue<>(Collections.reverseOrder());
		
	}
	public static void main(String[] args) {
		q1();
	}
}
