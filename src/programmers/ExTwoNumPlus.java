package programmers;

import java.util.Arrays;
import java.util.HashSet;

public class ExTwoNumPlus {
	
	public static int[] solution(int[] numbers) {
        int[] answer = {};
        
        HashSet<Integer> hs = new HashSet<>();
        
        for (int i = 0; i < numbers.length; i++) {
        	for (int j = i+1; j < numbers.length; j++) {
				hs.add(numbers[i]+numbers[j]);
			}
		}
        
        Integer[] array = new Integer[hs.size()];
        hs.toArray(array);
        Arrays.sort(array);
        
        answer = Arrays.stream(array).mapToInt(i->i).toArray();
        return answer;
    }

	
	public static void main(String[] args) {
		int[] a= new int[] {2,1,3,4,1};
		solution(a);
	}
}
