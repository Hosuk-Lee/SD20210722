package Question_SD_Re;
import java.util.*;
public class QueuePriority {

	/* �켱���� */
	/*
	            1
	      3           2
	   7    9      6
	   
	   �׻� 1�� ��ġ�� Top node ����
	   
	   ���� �߰��Ҷ� offer , add
	   ���� Ȯ���Ҷ� peek
	   ���� �����Ҷ� pool
	         
	 */
	public static void q1() {
		int n[] =new int[] {1, 3, 1, 10, 2, 12};
		
		//int�� priorityQueue ���� (�켱������ ���� ���� ��)
		PriorityQueue<Integer> q1 = new PriorityQueue<>();

		//int�� priorityQueue ���� (�켱������ ���� ���� ��)
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
		//String�� priorityQueue ���� (�켱������ ���� ���� ��)
		PriorityQueue<String> q3 = new PriorityQueue<>(); 

		//String�� priorityQueue ���� (�켱������ ���� ���� ��)
		PriorityQueue<String> q4 = new PriorityQueue<>(Collections.reverseOrder());
		
	}
	public static void main(String[] args) {
		q1();
	}
}
