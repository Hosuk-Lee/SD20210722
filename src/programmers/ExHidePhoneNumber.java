package programmers;

public class ExHidePhoneNumber {

	public static void main(String[] args) {
		System.out.println("01033334444".replaceAll("[0-9]$", "*"));
		
		String s = "01033334444";
		System.out.println(s.replaceAll(".(?=.{4})", "*"));
		
		System.out.println("aaaa".replaceAll(".(?=.{4})", "*"));
		/*
		 .	������ �� ����(�� \�� ���� �� ����)
		 ( )	�Ұ�ȣ ���� ���ڸ� �ϳ��� ���ڷ� �ν� 
		 |	���� �ȿ��� or ������ ������ �� ���
		 * */
		
		System.out.println(s.substring(s.length()-4));
		
		String ss=s.substring(0,s.length()-4).replaceAll("[0-9]", "*");
		String la=s.substring(s.length()-4);
		s=s.replaceAll("[0-9]", "*");
		System.out.println(ss+la);
		
		
	}
}
