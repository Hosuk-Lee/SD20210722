package programmers;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class KakaoSpicy {
	
	public static int solution(int[] scoville, int K) {
		Queue<Integer> q = new PriorityQueue<Integer>();
		for(int n: scoville) q.offer(n);
		
		int cnt=0;
		while(q.peek() < K) {
			System.out.println("--");
			System.out.println(q.peek());
			
			if(q.size()==1) return -1;
			
			q.offer( q.poll()+(q.poll()*2) ) ;
			cnt++;
		}
		System.out.println("@"+cnt);
		return cnt;
	}

	public static int solution2(int[] scoville, int K) {
        int answer = 0;
        
        int min=0;
        int tmp[]=new int[scoville.length];
        
        
        if (scoville.length==1) return -1;
        while (min <= K && answer++<scoville.length) {
        	System.arraycopy(scoville, 2, tmp, 1, tmp.length-2);
        	
        	// °è»ê
        	tmp[0]=scoville[0]+(scoville[1]*2);
        	
        	// º¹±Í
        	System.arraycopy(tmp, 0, scoville, 0, tmp.length);
        	
        	Arrays.sort(scoville, 0, scoville.length-answer);
        	min=scoville[0];
		}
        
        System.out.println(answer);
        System.out.println(scoville.length);
        if ( answer > scoville.length ) return -1;
        
        return answer;
    }
	
	public static void printArrI(int a[]) {
		System.out.println("Print int Array");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] +" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		solution(new int[] {1, 2, 3, 9, 10, 12},7);
	}

}
