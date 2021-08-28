package programmers;

import java.util.Stack;

public class ExStackAndQueue {
	public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        
        Stack<Integer> st1 = new Stack<Integer>();
        Stack<Integer> st2 = new Stack<Integer>();
        
        for(int i=progresses.length-1; i>=0; i--) {
        	st1.add(progresses[i]);
        	st2.add(speeds[i]);
        	
		}
        
        int days = 1;
        int diff = 0;
        
        int cnt[] = new int[100];
        
        int tmpPr = st1.pop();
        int tmpSp = st2.pop();
        int idx = 0;
        int tmpCnt = 0;
        
        boolean yn = false;
        while (days <= 100) {
			diff = 100-tmpPr-days*tmpSp;
			// System.out.println("days"+days+"diff"+diff+"pr"+tmpPr+"Sp"+tmpSp);
        	if ( diff <= 0 ) {
        		yn = true;
        		tmpCnt++;
        		// System.out.println("tmpCnt"+tmpCnt);
        		if (st1.isEmpty()) {
        			cnt[idx] = tmpCnt;
        			break;
        		} else {
        			cnt[idx] = tmpCnt;
        			tmpPr = st1.pop();
        			tmpSp = st2.pop();
        		}
        	} else {
        		tmpCnt = 0;
        		days++;
        		if ( yn ) {
        			idx++;
        			yn = false;
        		}
        	}
		}
        
        // System.out.println("idx" + idx);
        // answer = new int[idx+1];
        // for (int i = 0; i <= idx; i++) {
        // 	answer[i] = cnt[i];
		// 	// System.out.println("Result : " + answer[i]);
		// 	
		// }
        
        return answer;
    }
	
	public static void main(String[] args) {
		// int[] a = {93,30,55};
		// int[] b = {1,30,5};
		// solution(a,b);
		
		int[] a = {95, 90, 99, 99, 80, 99};
		int[] b = {1, 1, 1, 1, 1, 1};
		solution(a,b);
	}
}
