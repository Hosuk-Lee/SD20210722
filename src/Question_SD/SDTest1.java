package Question_SD;
import java.util.Scanner;

public class SDTest1 {
	
	
	
	/*
 신한이는 영문 문장을 입력 받아 모음의 개수를 Count하는 프로그램이 필요하다. 이 프로그램을 작성해보세요.

(단, 모음은 a, e, i, o, u 이고, 대문자 및 소문자 포함임) 

입력
입력은 여러 개의 테스트 케이스로 이루어져 있으며, 각 줄마다 영어 대소문자,  ‘,’ ,  ‘.’ ,  ‘!’ , ‘?’ , 공백으로 이루어진 문장이 주어진다. 각 줄은 최대 200글자로 이루어져 있다.

입력의 끝에는 한 줄에 ‘#’ 한 글자만이 주어진다.

출력
각 줄마다 모음의 개수를 세서 출력한다.

입력의 끝에는 한 줄에 ‘#’ 한 글자만이 주어진다.

출력
각 줄마다 모음의 개수를 세서 출력한다.

입출력 예
[입력]

A Better World through Finance

The meaning of compassionate finance?

Shinhan Financial Group is committed to becoming a world class financial service company that is representative of Korea by seeking.

#
	 */
	private static int Solution(String text) {
		// System.out.println(text);
		// System.out.println(text.replaceAll("[^aAeEiIoOuU#]", ""));
		
		String line[] = text.split("\n");
		
		for (String string : line) {
			if("#".equals(string)) break;
			System.out.println(string.replaceAll("[^aAeEiIoOuU]", "").length());
		}
		
		return 0;
	}
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	      
	    String inStr = "";
	    while(true) {
	      inStr = scan.nextLine();
	      if("#".equals(inStr)) break;
	      System.out.println(inStr.replaceAll("[^aAeEiIoOuU]", "").length());
	    }

	}
}
