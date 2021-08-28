package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExSortAndMaxValue {
//	public static String solution(int[] numbers) {
//        String answer = "";
//        
//        String strNum = "";
//        for (int i = 0; i < numbers.length; i++) {
//			strNum += "" + numbers[i];
//		}
//        // System.out.println(strNum);
//        
//        List<String> list = new ArrayList<>();
//        permutation(list,strNum);
//        String[] a = new String[list.size()];
//        list.toArray(a);
//        Arrays.sort(a,Collections.reverseOrder());
//        // System.out.println(a[0]);
//        
//        return answer;
//    }
//	
//	public static void permutation(List<String> l,String str) { 
//	    permutation(l,"", str); 
//	}
//
//	private static void permutation(List<String> l,String prefix, String str) {
//	    int n = str.length();
//	    if (n == 0) {
//	    	l.add(prefix); // System.out.println(prefix);
//	    }
//	    else {
//	        for (int i = 0; i < n; i++)
//	            permutation(l, prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
//	    }
//	}
	
	public static String solution(int[] numbers) {
	    String answer = "";
	    
	    String[] a = new String[numbers.length];
	    
	    for (int i = 0; i < a.length; i++) {
	    	a[i]=String.valueOf(numbers[i]);
	    }
	    Arrays.sort(a,Collections.reverseOrder());
	    for (int i = 0; i < a.length; i++) {
	        // System.out.println(a[i]);
	        answer += a[i];
	    }
      
        return answer;
	}
	
	public static void main(String[] args) {
		// [6, 10, 2]	"6210"
		// [3, 30, 34, 5, 9]	"9534330"
		solution(new int[]{6, 10, 2});
		solution(new int[]{3, 30, 34, 5, 9});
	}
}
