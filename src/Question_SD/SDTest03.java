package Question_SD;
public class SDTest03 {
	
	private static int Solution(String[] nm, int[] rk) {
		return 0;
	}
	
/*
�����̴� ���� ������ ���� ���ϴ� ���α׷��� �ʿ��ϴ�. 
1�� �� ��, 2�� �� ��, 3�� �� ��, 
�̷� ������ 1223334444 �� �̷��� ������ ����� ��� ������ ������ �ָ� �� ���� �� ���� ���ϴ� ���α׷��̴�. �� ���α׷��� �ۼ��غ�����

�Է�
ù° �ٿ� ������ ���۰� ���� ��Ÿ���� ���� N, M(1�� N �� M �� 1,000)�� �־�����. ��, �������� N��° ���ں��� M��° ���ڱ��� ���� ���ϸ� �ȴ�.

���
ù �ٿ� ������ ���ϴ� ������ ���� ����Ѵ�.

[�Է�]
3 7

[���]
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
