package Question_SD_Re;
import java.util.Iterator;
import java.util.Scanner;
/*
금융이는 1*1크기의 그림으로 모자이크 처리한 100*100크기의 그림을 가지고 있다. 어느 날 이 모자이크 중 일부 그림이 너무 보기 싫어서 N개의 불투명한 종이로 그림을 가리기 시작했다. 불투명한 종이로 가린다고 항상 그 그림이 안 보이는 것은 아니다. 그 그림의 현재 부분 위에 M개 이하의 종이가 올려져 있으면 그림은 그 부분에서 보이게 된다.

그림의 크기는 100*100이고, N개의 종이는 왼쪽 아래 모서리 좌표와 오른쪽 위 모서리 좌표가 입력으로 들어온다. 또, 종이가 가리는 영역에는 두 모서리의 좌표도 포함된다. 예를 들어, (1,1)부터 (2,2)를 가린다면, 총 4개의 그림이 가려진다. (1,1), (1,2), (2,1), (2,2).

100*100크기의 모자이크 중에 보이지 않는 그림의 개수를 세는 프로그램을 작성하시오.

입력
첫째 줄에 N과 M이 주어진다. N은 0보다 크거나 같고, 50보다 작거나 같다. M은 0보다 크거나 같고, 50보다 작거나 같다. 둘째 줄부터 N개의 줄에 종이의 좌표가 주어진다. 왼쪽 아래 모서리의 x, y좌표, 오른쪽 위 모서리의 x, y좌표 순으로 주어진다. 모든 좌표는 100보다 작거나 같은 자연수이다.
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
