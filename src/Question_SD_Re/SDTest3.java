package Question_SD_Re;
import java.util.Scanner;

/*
�����̴� ù ����� �� ���� ȿ�������� �ð� ������ �ؾ� �Ѵٴ� ���� ���޾Ҵ�.
�����̴� �Ϸ翡 �ؾ� �� ���� �� N���� �ְ� �� �ϵ��� ���ϰ� 1������ N������ ���ʴ�� ��ȣ�� �ٿ���.
�����̴� �ð��� ȿ�������� �����ϱ� ����, �� �ϵ鿡 ���� ������ �� �ð��� �ɸ��� �ð��� ���� ����� �������.
�� ����� i��° ���� ���� ó���ϴµ� ��Ȯ�� Ti �ð��� �ɸ��� Si �� ���� �� ���� ó���Ͽ��� �Ѵٴ� ���� ��� �ִ�.
�����̴� 0�ú��� Ȱ���� ������ �� �ְ�, �� �� �̻��� ���� ���� �ð��� ó���� �� ����.

�����̰� �ٶ�� ���� �ִ��� �����Ӱ� ����ϴ� ���̴�. ������ �̷��� �����̸� ���� �ϵ��� ��� �����ð� ���� ó���� �� �ִ� ���� \
������ �ִ��� �ʰ� ���� ������ �� �ִ� �ð��� �� ������ �˾Ƴ��� ���̴�.
ù° �ٿ� ���� �� N�� �Էµǰ� ���� N (1 �� N �� 1,000)���� �ٿ� ���� 
i+1��° �ٿ��� i��° �Ͽ� ���� 
Ti (1 �� N �� 1,000)�� 
Si (1 �� N �� 1,000,000)�� �Էµȴ�.

���
�����̰� ���� ��� ����ĥ �� �ִ� ���� ���� ���۽ð��� ����Ѵ�. ���� 0�ú��� �����Ͽ��� ���� ����ĥ �� ���ٸ� -1�� ����Ѵ�.
�����(��)
[�Է¿�]

4

3 5
8 14
5 20
1 16

[��¿�] 

2
*/
public class SDTest3 {

	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int il = Integer.parseInt(scan.nextLine());
		
		int tot=0;
		
		int jobArr[] = new int[il];
		int endArr[] = new int[il];
		int minArr[] = new int[il];
		for (int i = 0; i < il; i++) {
			String a = scan.nextLine();
			String[] inStrArr = a.split(" ");
			tot+=Integer.parseInt(inStrArr[0]);
			
			jobArr[i]=Integer.parseInt(inStrArr[0]);
			endArr[i]=Integer.parseInt(inStrArr[1]);
			minArr[i]=endArr[i]-jobArr[i];
		}
		
		for ( int i=0; i< il; i++) {
			for (int j = i+1; j < il; j++) {
				int sw = swapN(minArr[i],minArr[j]);
				if(sw > 0) {
					int tmp1 = jobArr[i]; int tmp2 = endArr[i];int tmp3 = minArr[i];
					jobArr[i]=jobArr[j]; jobArr[j]=tmp1;
					endArr[i]=endArr[j]; endArr[j]=tmp2;
					minArr[i]=minArr[j]; minArr[j]=tmp3;
				}
			}
			
		}
		//System.out.println(tot);
		if ( tot > 24 ) {
			System.out.println(-1);
		} else {
			if ( minArr[0] + tot > 24) {
				for (int i = minArr[0]; i > 0; i--) {
					if ( --minArr[0]+tot<=24) {
						System.out.println("@"+(minArr[0]+tot));
						System.out.println(minArr[0]);
						System.exit(0);
					}
				}
				System.out.println(-1);
			}else {
				System.out.println(minArr[0]);
			}
		}

	}
	public static int swapN(int a,int b) {
		return a-b;
	}
}
