package Question_SD_Re;
import java.util.Scanner;

/*
 * 
�����̴� ����a�� ����b�� �ִ�.
����a�� ũ�Ⱑ N1 * M1�̰�, ����b�� ũ��� N2 * M2�̴�

������ ���̴� ��ĭ�� ��ĭ�� �ƴ� ĭ�� �ִµ�, 
��ĭ�� . ���� ��ĭ�� �ƴ� ĭ�� X�� ǥ���Ѵ�

�����̴� ����a�� ����b�� ���ļ� (��ġ�� �ʾƵ� �ȴ�.)
X�θ� �̷���� ���簢���� ���� ũ�� ������� �Ѵ�.

����a�� ����b�� ������ 90�� ������ ȸ����Ű�� �͵� �����ϰ�, ������ �͵� �����ϴ�.
����a�� ����b�� ������ ���ļ� X�� �̷���� ���簢�� ������ �ִ븦 ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
1 1   n1 m1
X     ���� ��ĭ�� ����
1 1   
X

2

ù° �ٿ� ����a�� ũ�� N1�� M1�� �Է����� ���´�.
�� �� N1�ٿ� ������ ������ ������, ����b�� ������ �̿� ����������, N1+2��° �ٺ��� ���´�. (1 �� N1, M1, N2, M2 �� 50)
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
