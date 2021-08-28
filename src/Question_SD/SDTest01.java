package Question_SD;
import java.util.Scanner;

public class SDTest01 {
	/*
	������� ����ź������ ����Ͽ� ��ž�� ���� ���� �Ѵ�. ��ž�� N���� ������ �̷���� �ִ�.
    �Ʒ��������� 1��, �� N�� �̴�. 
    �� �����̴� 
    		������, ��Ȳ��, ������� ���ǰ�� ������ �ִµ� 
    
    �� ���ǰ�� ������ ��Ģ�� ���ؼ� ��ž�� ����� �Ϸ��� �Ѵ�.

	M�������� �� M���� ���ǰ�� �־�� �Ѵ� �� �� ���� �������� ������ ���� ������
	�� ���� ���ǰ�� ���� ���� ���ƾ� �Ѵ�. 
	
	���ظ� ���ϰ� �ϱ� ���� �������ڸ�, 5���� ���ǰ�� �������� �� ��,
	������ 2��, ��Ȳ�� 3���� ���� ����ϸ�, �������� ��Ȳ���� ���� �ٸ��� ������ �ȵȴ�.
	������ 4���� ������ 2��, ����� 2���� ���� ������ �����ϴ�.

	N���� ���� ���ǰ�� ���� �־��� ��, ��ž�� ����ϴ� ����� ���� ����ϴ� �˰����� �ۼ��Ͻÿ�.
	
	�Է� : 2 1 1 1 
	��� : 6
	*/
	
	static int N = 2;
	static int count = 0;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String inStr = scan.nextLine();
        String a[] = inStr.split(" ");
       N = Integer.parseInt(a[0]);
       int[] arr = new int[3];
       arr[0] =Integer.parseInt(a[1]);
       arr[1] =Integer.parseInt(a[2]);
       arr[2] =Integer.parseInt(a[3]);
       
       int n=3;
       boolean[] visited = new boolean[n];

       for (int i = 1; i <= n; i++) {
           System.out.println("\n" + n + " �� �߿��� " + i + " �� �̱�");
           // �迭, 
           comb(arr, visited, 0, n, i);
       }
       
       System.out.println("=======================");
       System.out.println("Count : " + count);
       
	}

    // ��� ���
    // ��� ���� : comb(arr, visited, 0, n, r)
    static void comb(int[] arr, boolean[] visited, int depth, int n, int r) {
        if (r == 0) {
            check(arr, visited, n);
            return;
        }
        
        if (depth == n) {
            return;
        }

        visited[depth] = true;
        comb(arr, visited, depth + 1, n, r - 1);

        visited[depth] = false;
        comb(arr, visited, depth + 1, n, r);
    }

    // �迭 ���
    static void check(int[] arr, boolean[] visited, int n) {
        // Arrays.sort(arr);
        // �ߺ� ����
        int a=0,b=0,c=0;
    	for (int i = 0; i < n; i++) {
            if (visited[i]) {
                if (i==0)a=arr[i];
                if (i==1)b=arr[i];
                if (i==2)c=arr[i];
            }
        }
    	solution(a,b,c);
    }
    
    static void solution(int a, int b, int c) {
    	System.out.println( "MIN:"+Math.min(Math.min(a, b),c) );
    	System.out.println("N:"+N+",A:"+a+",B:"+b+",C"+c);
    	
    	for (int i = 1; i <= N; i++) {
    		System.out.println("N:"+N+",A:"+a+",B:"+b+",C"+c+"----i"+i);
			
    		// A����
    		// 1. a��������
    		if ( a - i >= 0 && b==0 && c==0) {
    			count++;
    		}
    		
    		// B����
    		if ( b - i >= 0 && a==0 && c==0) {
    			count++;
    		}
    		
    		// C����
    		if ( c - i > 0 && a==0 && b==0 ) {
    			count++;
    		}
			
		}
    }
}
