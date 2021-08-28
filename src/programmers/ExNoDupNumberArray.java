package programmers;

public class ExNoDupNumberArray {
	
	public static int[] solution(int []arr) {
        int[] answer = {};
        
//        HashSet<Integer> hs = new HashSet<>();
//        for (int i = 0; i < arr.length; i++) {
//			hs.add(arr[i]);
//		}
//        
//        Iterator<Integer> it = hs.iterator();
//        
//        int idx = 0;
//        answer = new int[hs.size()];
//        while (it.hasNext()) {
//			Integer a = (Integer) it.next();
//			
//			answer[idx] = a;
//			idx++;
//			
//		}
        
        String tmp = "";
        for (int i = 0; i < arr.length; i++) {
			tmp += arr[i];
		}
        
        System.out.println(tmp);
        for ( int i = 0 ; i < 10 ; i ++ ) {
        	tmp = tmp.replaceAll("["+i+"]{2,}", ""+i);
        }
        
        answer = new int[tmp.length()];
        for ( int i = 0 ; i < tmp.length(); i++)
        {
        	answer[i] = Integer.parseInt(tmp.charAt(i) +"");
        			
        }

        return answer;
    }
	
	public static void main(String[] args) {
		solution( new int[] {1,1,3,3,0,1,1} );
	}
}
