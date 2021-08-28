package Question_SD_Re;
import java.util.Scanner;

/*
 * 
신한이는 종이a와 종이b가 있다.
종이a의 크기가 N1 * M1이고, 종이b의 크기는 N2 * M2이다

각각의 종이는 빈칸과 빈칸이 아닌 칸이 있는데, 
빈칸은 . 으로 빈칸이 아닌 칸은 X로 표시한다

세준이는 종이a와 종이b를 겹쳐서 (겹치지 않아도 된다.)
X로만 이루어진 직사각형을 가장 크게 만들려고 한다.

종이a와 종이b는 각각을 90도 단위로 회전시키는 것도 가능하고, 뒤집는 것도 가능하다.
종이a와 종이b를 적절히 겹쳐서 X로 이루어진 직사각형 넓이의 최대를 구하는 프로그램을 작성하시오.

입력
1 1   n1 m1
X     정보 빈칸이 없다
1 1   
X

2

첫째 줄에 종이a의 크기 N1과 M1가 입력으로 들어온다.
그 뒤 N1줄에 종이의 정보가 들어오고, 종이b의 정보도 이와 마찬가지로, N1+2번째 줄부터 들어온다. (1 ≤ N1, M1, N2, M2 ≤ 50)
 */
public class SDTest1 {
	
	
	
	public static void main(String[] args) {
		
		int a1=0, a2=0; // N M
	    int b1=0, b2=0; // N M
	    
	    boolean a_bool=false;
	    boolean b_bool=false;
	    
		Scanner scan = new Scanner(System.in);
	    String inStr = "";
	    String[] inStrArr;
	    inStr=scan.nextLine();
	    inStrArr = inStr.split(" ");
	    a1=Integer.parseInt(inStrArr[0]);
	    a2=Integer.parseInt(inStrArr[1]);
	    
	    inStr=scan.nextLine();
	    if("X".equals(inStr)) a_bool=true;
	    
	    inStr=scan.nextLine();
	    inStrArr = inStr.split(" ");
	    b1=Integer.parseInt(inStrArr[0]);
	    b2=Integer.parseInt(inStrArr[1]);
	    
	    inStr=scan.nextLine();
	    if("X".equals(inStr)) b_bool=true;
	    
	    
	    
	    if (  a_bool && !b_bool) System.out.println(a1*a2);
	    else if ( !a_bool &&  b_bool) System.out.println(b1*b2);
	    else if ( !a_bool && !b_bool) System.out.println(0);
	    else {
	    	if ( a1==b1) {
	    		System.out.println(a1*(a2+b2));
	    	}else if (a2==b2) {
	    		System.out.println(a2*(a1+b1));
	    	}else if (a1==b2) {
	    		System.out.println(a1*(a2+b1));
	    	}else if (a2==b1) {
	    		System.out.println(a2*(a1+b2));
	    	} else {
	    		int aa=a1*a2;
	    		int bb=b1*b2;
	    		System.out.println(aa>bb?aa:bb);
	    	}
	    	
	    }
	    
	}
	
	public static void printArrS(String a[]) {
		System.out.println("Print int String");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] +" ");
		}
		System.out.println();
	}
}
