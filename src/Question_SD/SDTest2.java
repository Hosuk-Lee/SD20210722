package Question_SD;
import java.util.Scanner;

public class SDTest2 {
	
/*

�����̴� ���� ������ ���� ���ϴ� ���α׷��� �ʿ��ϴ�. 
1�� �� ��,
2�� �� ��,
3�� �� ��, 

�̷� ������ 1223334444 �� �̷��� ������ ����� ��� ������ ������ �ָ� �� ���� �� ���� ���ϴ� ���α׷��̴�. �� ���α׷��� �ۼ��غ�����

�Է�
ù° �ٿ� ������ ���۰� ���� ��Ÿ���� ���� N, M(1�� N �� M �� 1,000)�� �־�����. ��, �������� N��° ���ں��� M��° ���ڱ��� ���� ���ϸ� �ȴ�.

���
ù �ٿ� ������ ���ϴ� ������ ���� ����Ѵ�.

1234567
1223334444

[�Է�]
3 7

[���]
15
*/

	public static void printArrI(int a[]) {
		System.out.println("Print int Array");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] +" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		
		int idx = 0;
		int data[] = new int[1000];
		
		for(int k=0; k<data.length; ) {
			idx++;
			for ( int i=1; i<=idx; i++ ) {
				data[k] = idx;
				k++;
				if (k>=data.length) break;
			}
		}
		printArrI(data);
		
		String inStr = "1 1000";
	    String inStrArr[]= inStr.split(" ");
	    
	    Scanner scan = new Scanner(System.in);
	    inStr = scan.nextLine();
	    inStrArr = inStr.split(" ");
	    
	    System.out.println(inStr+"@"+inStrArr.length);
	    
	    int N = Integer.parseInt( inStrArr[0]);
	    int M = Integer.parseInt( inStrArr[1]);

		int result = 0;
		for ( int i=N-1; i<M; i++ ) {
			// result += Integer.parseInt( String.valueOf( str.charAt(i) ) );
			System.out.println((i+1)+":"+data[i]);
			result+=data[i];
		}
		System.out.println(result);

	}
}
