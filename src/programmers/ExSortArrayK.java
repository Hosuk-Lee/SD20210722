package programmers;

import java.util.Arrays;

public class ExSortArrayK {
	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        answer = new int[commands.length];
        
        int[] tmp = {};
        for (int i = 0; i < commands.length; i++) {
			// System.out.println(commands[i][0]);
			// System.out.println(commands[i][1]);
			
			int arraySize = commands[i][1] - commands[i][0] + 1;
			System.out.println(arraySize);
			tmp = new int[arraySize];
			
			System.arraycopy(array, commands[i][0]-1, tmp, 0, arraySize);
			Arrays.sort(tmp);
			// System.out.println("@@"+tmp[commands[i][2]-1]);
			answer[i] = tmp[commands[i][2]-1];
		}
        return answer;
    }
	
	public static void main(String[] args) {
		// [1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]	[5, 6, 3]]
		int a [] = {1, 5, 2, 6, 3, 7, 4};
		int b[][] = {{2, 5, 3}, {4, 4, 1},{1, 7, 3}};
		// result 5,6,3
		solution(a, b);
	}
}
