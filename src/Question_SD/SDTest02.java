package Question_SD;
import java.util.Scanner;

public class SDTest02 {
	
	
	
	/*
 �����̴� ���� ������ �Է� �޾� ������ ������ Count�ϴ� ���α׷��� �ʿ��ϴ�. �� ���α׷��� �ۼ��غ�����.

(��, ������ a, e, i, o, u �̰�, �빮�� �� �ҹ��� ������) 

�Է�
�Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� ������, �� �ٸ��� ���� ��ҹ���,  ��,�� ,  ��.�� ,  ��!�� , ��?�� , �������� �̷���� ������ �־�����. �� ���� �ִ� 200���ڷ� �̷���� �ִ�.

�Է��� ������ �� �ٿ� ��#�� �� ���ڸ��� �־�����.

���
�� �ٸ��� ������ ������ ���� ����Ѵ�.

�Է��� ������ �� �ٿ� ��#�� �� ���ڸ��� �־�����.

���
�� �ٸ��� ������ ������ ���� ����Ѵ�.

����� ��
[�Է�]

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
