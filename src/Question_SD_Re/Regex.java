package Question_SD_Re;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void r1() {
		String IN_vowel = "[AaEeIiOoUu]"; // ������ �����
		String EX_vowel = "[^AaEeIiOoUu]"; // ������ �����
		String text = "abacdefeghijklmnoopqrstuuvwxyz";
		System.out.println(text.replaceAll(IN_vowel, ""));
		System.out.println(text.replaceAll(EX_vowel, ""));
	}
	
	public static void r2() {
		String str = "^[0-9]*$"; //���ڸ�
        String val = "123456789"; //����ڿ�
    
        boolean regex = Pattern.matches(str, val);
        System.out.println(regex);
        
        Pattern pattern = Pattern.compile("^[a-zA-Z]*$"); //�����ڸ�
        val = "abcdef"; //����ڿ�
        Matcher matcher = pattern.matcher(val);
        System.out.println(matcher.find());
        

		/*
		.	������ �� ����(�� \�� ���� �� ����)
		( )	�Ұ�ȣ ���� ���ڸ� �ϳ��� ���ڷ� �ν� 
		|	���� �ȿ��� or ������ ������ �� ���
		*/
        val = "adcbe";
        
        System.out.println(Pattern.matches(".(bcd|dcb|cbe).", val));
        System.out.println("@@@@");
        System.out.println(Pattern.matches(".(?=.{4})", val));
        System.out.println("aaaa".replaceAll("(?=.{4})", "*"));
        System.out.println(val.replaceAll(".(?=.{4})", "*"));
	}
	
	public static void main(String[] args) {
		System.out.println(2);
		r2();
	}
}
