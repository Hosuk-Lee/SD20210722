package Question_SD_Re;
import java.util.Iterator;
import java.util.Scanner;
/*
�����̴� 1*1ũ���� �׸����� ������ũ ó���� 100*100ũ���� �׸��� ������ �ִ�. ��� �� �� ������ũ �� �Ϻ� �׸��� �ʹ� ���� �Ⱦ N���� �������� ���̷� �׸��� ������ �����ߴ�. �������� ���̷� �����ٰ� �׻� �� �׸��� �� ���̴� ���� �ƴϴ�. �� �׸��� ���� �κ� ���� M�� ������ ���̰� �÷��� ������ �׸��� �� �κп��� ���̰� �ȴ�.

�׸��� ũ��� 100*100�̰�, N���� ���̴� ���� �Ʒ� �𼭸� ��ǥ�� ������ �� �𼭸� ��ǥ�� �Է����� ���´�. ��, ���̰� ������ �������� �� �𼭸��� ��ǥ�� ���Եȴ�. ���� ���, (1,1)���� (2,2)�� �����ٸ�, �� 4���� �׸��� ��������. (1,1), (1,2), (2,1), (2,2).

100*100ũ���� ������ũ �߿� ������ �ʴ� �׸��� ������ ���� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� N�� M�� �־�����. N�� 0���� ũ�ų� ����, 50���� �۰ų� ����. M�� 0���� ũ�ų� ����, 50���� �۰ų� ����. ��° �ٺ��� N���� �ٿ� ������ ��ǥ�� �־�����. ���� �Ʒ� �𼭸��� x, y��ǥ, ������ �� �𼭸��� x, y��ǥ ������ �־�����. ��� ��ǥ�� 100���� �۰ų� ���� �ڿ����̴�.
*/
public class SDTest2 {
	
	public static void main(String[] args) {
		
		int mo[][]=new int[100][100];
		
		Scanner scan = new Scanner(System.in);
	    String inStr = "";
	    String inStrArr[];
	    inStr = scan.nextLine();
	    inStrArr=inStr.split(" ");
	    
	    int N=Integer.parseInt(inStrArr[0]);
	    int M=Integer.parseInt(inStrArr[1]);
	    
	    int x1=0, y1=0, x2=0, y2=0;
	    for (int i = 0; i < N; i++) {
	    	inStr = scan.nextLine();
		    inStrArr=inStr.split(" ");
		    x1=Integer.parseInt(inStrArr[0]); y1=Integer.parseInt(inStrArr[1]);
		    x2=Integer.parseInt(inStrArr[2]); y2=Integer.parseInt(inStrArr[3]);
		    for (int j = x1-1; j < x2; j++) {
				for (int k = y1-1; k < y2; k++) {
					mo[j][k]++;
				}
			}
			
		}
	    
	    int count = 0;
	    for (int i = 0; i < 100; i++) {
	    	for (int j = 0; j < 100; j++) {
	    		if (mo[i][j]>M) count++;
	    	}
		}
	    System.out.println(count);
	    

	}
}
