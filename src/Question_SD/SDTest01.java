package Question_SD;
import java.util.Scanner;

public class SDTest01 {
	/*
	김신한은 석가탄신일을 기념하여 블럭탑을 쌓을 려고 한다. 블럭탑은 N개의 층으로 이루어져 있다.
    아래에서부터 1층, … N층 이다. 
    또 신한이는 
    		빨간색, 주황색, 노란색의 장식품을 가지고 있는데 
    
    이 장식품을 일정한 규칙에 의해서 블럭탑에 장식을 하려고 한다.

	M층에서는 딱 M개의 장식품이 있어야 한다 또 각 층에 놓으려고 선택한 색이 있으면
	그 색의 장식품의 수는 서로 같아야 한다. 
	
	이해를 편하게 하기 위해 설명하자면, 5층에 장식품을 놓으려고 할 때,
	빨간색 2개, 주황색 3개와 같이 장식하면, 빨간색과 주황색의 수가 다르기 때문에 안된다.
	하지만 4층에 빨간색 2개, 노란색 2개와 같이 놓으면 가능하다.

	N개의 층과 장식품의 수가 주어질 때, 블럭탑을 장식하는 경우의 수를 출력하는 알고리즘을 작성하시오.
	
	입력 : 2 1 1 1 
	출력 : 6
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
           System.out.println("\n" + n + " 개 중에서 " + i + " 개 뽑기");
           // 배열, 
           comb(arr, visited, 0, n, i);
       }
       
       System.out.println("=======================");
       System.out.println("Count : " + count);
       
	}

    // 재귀 사용
    // 사용 예시 : comb(arr, visited, 0, n, r)
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

    // 배열 출력
    static void check(int[] arr, boolean[] visited, int n) {
        // Arrays.sort(arr);
        // 중복 제거
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
			
    		// A기준
    		// 1. a만가지고
    		if ( a - i >= 0 && b==0 && c==0) {
    			count++;
    		}
    		
    		// B기준
    		if ( b - i >= 0 && a==0 && c==0) {
    			count++;
    		}
    		
    		// C기준
    		if ( c - i > 0 && a==0 && b==0 ) {
    			count++;
    		}
			
		}
    }
}
