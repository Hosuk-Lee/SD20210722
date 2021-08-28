package programmers;

public class ExHidePhoneNumber {

	public static void main(String[] args) {
		System.out.println("01033334444".replaceAll("[0-9]$", "*"));
		
		String s = "01033334444";
		System.out.println(s.replaceAll(".(?=.{4})", "*"));
		
		System.out.println("aaaa".replaceAll(".(?=.{4})", "*"));
		/*
		 .	임의의 한 문자(단 \은 넣을 수 없음)
		 ( )	소괄호 안의 문자를 하나의 문자로 인식 
		 |	패턴 안에서 or 연산을 수행할 때 사용
		 * */
		
		System.out.println(s.substring(s.length()-4));
		
		String ss=s.substring(0,s.length()-4).replaceAll("[0-9]", "*");
		String la=s.substring(s.length()-4);
		s=s.replaceAll("[0-9]", "*");
		System.out.println(ss+la);
		
		
	}
}
