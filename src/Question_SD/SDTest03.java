package Question_SD;
public class SDTest03 {
	
	private static int Solution(String[] nm, int[] rk) {
		return 0;
	}
	
/*
신한이는 현재 누적의 합을 구하는 프로그램이 필요하다. 
1을 한 번, 2를 두 번, 3을 세 번, 
이런 식으로 1223334444 … 이러한 수열을 만들고 어느 일정한 구간을 주면 그 구간 내 합을 구하는 프로그램이다. 이 프로그램을 작성해보세요

입력
첫째 줄에 구간의 시작과 끝을 나타내는 정수 N, M(1≤ N ≤ M ≤ 1,000)가 주어진다. 즉, 수열에서 N번째 숫자부터 M번째 숫자까지 합을 구하면 된다.

출력
첫 줄에 구간에 속하는 숫자의 합을 출력한다.

[입력]
3 7

[출력]
15
*/
//	int idx = 0;
//	String tmp = "";
//	while (tmp.length()<=1000) {
//		tmp += "1223334444";
//		// idx++;
//		// for ( int i=1; i<=idx; i++ ) {
//		// 	tmp += ""+idx;
//		// }
//	}
//	
//	// Scanner scan = new Scanner(System.in);
//	String inStr = "1 1";
//	String inStrArr[]= inStr.split(" ");
//	int N = Integer.parseInt( inStrArr[0]);
//	int M = Integer.parseInt( inStrArr[1]);
//	
//	String str = tmp.substring((N-1), M );
//	int result = 0;
//	for ( int i=0; i<str.length(); i++ ) {
//		result += Integer.parseInt( String.valueOf( str.charAt(i) ) );
//	}
//	System.out.println(result);
	
	public static void main(String[] args) {
		
		int idx = 0;
		String tmp = "";
		while (tmp.length()<=1000) {
			idx++;
			for ( int i=1; i<=idx; i++ ) {
				tmp += ""+idx;
			}
			
		}
		
		String inStr = "1000 1000";
	    String inStrArr[]= inStr.split(" ");
	    int N = Integer.parseInt( inStrArr[0]);
	    int M = Integer.parseInt( inStrArr[1]);

		String str = tmp.substring((N-1), M );
		int result = 0;
		for ( int i=0; i<str.length(); i++ ) {
			result += Integer.parseInt( String.valueOf( str.charAt(i) ) );
		}
		System.out.println(result);

	}
}
