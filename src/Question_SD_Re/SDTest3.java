package Question_SD_Re;
import java.util.Scanner;

/*
신한이는 첫 출근을 한 이후 효율적으로 시간 관리를 해야 한다는 것을 깨달았다.
신한이는 하루에 해야 할 일이 총 N개가 있고 이 일들을 편하게 1번부터 N번까지 차례대로 번호를 붙였다.
신한이는 시간을 효율적으로 관리하기 위해, 할 일들에 대해 끝내야 할 시간과 걸리는 시간을 적은 명단을 만들었다.
이 명단은 i번째 일은 일을 처리하는데 정확히 Ti 시간이 걸리고 Si 시 내에 이 일을 처리하여야 한다는 것을 담고 있다.
신한이는 0시부터 활동을 시작할 수 있고, 두 개 이상의 일을 같은 시간에 처리할 수 없다.

신한이가 바라는 점은 최대한 여유롭게 출근하는 것이다. 문제는 이러한 신한이를 도와 일들을 모두 마감시간 내에 처리할 수 있는 범위 \
내에서 최대한 늦게 일을 시작할 수 있는 시간이 몇 시인지 알아내는 것이다.
첫째 줄에 일의 수 N이 입력되고 다음 N (1 ≤ N ≤ 1,000)개의 줄에 대해 
i+1번째 줄에는 i번째 일에 대한 
Ti (1 ≤ N ≤ 1,000)와 
Si (1 ≤ N ≤ 1,000,000)가 입력된다.

출력
신한이가 일을 모두 끝마칠 수 있는 가장 늦은 시작시간을 출력한다. 만약 0시부터 시작하여도 일을 끝마칠 수 없다면 -1을 출력한다.
입출력(예)
[입력예]

4

3 5
8 14
5 20
1 16

[출력예] 

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
