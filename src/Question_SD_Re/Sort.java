package Question_SD_Re;

import java.util.Arrays;
import java.util.Collections;

public class Sort {

	public static void s1() {
		// sw > 0 오름차순 (10-6) 6이랑 10위치 치환 
		// sw = 0 동일값
		// sw < 0 내림차순 (10-6) 변화없음
		int a[] = {2,1,3,4,2};
		printArrI(a);
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				int sw=swapN(a[i],a[j]);
				if(sw > 0) {
					int tmp = a[i];
					a[i]=a[j];
					a[j]=tmp;	
				}
			}
		}
		printArrI(a);
	}
	
	public static void s2() {
		// Arrays 사용

		// 오름차순
		int a[] = {2,1,3,4,2};
		printArrI(a);
		Arrays.sort(a);
		printArrI(a);
		
		Integer[] a2 = Arrays.stream(a).boxed().toArray(Integer[]::new);
		Arrays.sort(a2, Collections.reverseOrder());

		printArrI(a2);
		
		// Arrays.sort(arr, 1, 3);
		// Arrays.sort(arr, 1, 3, Collections.reverseOrder());
		// Integer arr[] = {2,1,3,3,1};
		// Arrays.sort(arr);
		// printArrI(arr);
		// Arrays.sort(arr,Collections.reverseOrder());
		// printArrI(arr);
	}
	
	public static void s3() {
		// 이중 정렬

		// 오름차순
		int a[] = {2,1,3,4,2};
		String s[] = {"하","이","최","김","이"};
		printArrI(a);
		printArrS(s);
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				int sw=swapN(a[i],a[j]);
				if(sw > 0) {
					int tmpI = a[i]; String tmpS = s[i];
					a[i]=a[j]; a[j]=tmpI;
					s[i]=s[j]; s[j]=tmpS;
				} else if (sw==0) {
					sw=swapS(s[i],s[j]);
					if(sw > 0) {
						System.out.println("2단정렬"+sw+":"+s[i]+","+s[j]);
						String tmpS = s[i];
						s[i]=s[j]; s[j]=tmpS;
					}
				}
			}
		}
		printArrI(a);
		printArrS(s);

	}
	
	public static int swapN(int a,int b) {
		return a-b;
	}
	
	public static int swapS(String a,String b) {
		// System.out.println(a.compareTo(b));
		return a.compareTo(b);
	}
	
	public static void printArrI(int a[]) {
		System.out.println("Print int Array");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] +" ");
		}
		System.out.println();
	}
	public static void printArrI(Integer a[]) {
		System.out.println("Print Integer Array");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] +" ");
		}
		System.out.println();
	}
	public static void printArrS(String a[]) {
		System.out.println("Print int String");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] +" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// s1();
		// s3();
		
	}
}
