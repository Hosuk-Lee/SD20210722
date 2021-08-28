package Question_SD_Re;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void r1() {
		String IN_vowel = "[AaEeIiOoUu]"; // 모음만 지우기
		String EX_vowel = "[^AaEeIiOoUu]"; // 모음만 남기기
		String text = "abacdefeghijklmnoopqrstuuvwxyz";
		System.out.println(text.replaceAll(IN_vowel, ""));
		System.out.println(text.replaceAll(EX_vowel, ""));
	}
	
	public static void r2() {
		String str = "^[0-9]*$"; //숫자만
        String val = "123456789"; //대상문자열
    
        boolean regex = Pattern.matches(str, val);
        System.out.println(regex);
        
        Pattern pattern = Pattern.compile("^[a-zA-Z]*$"); //영문자만
        val = "abcdef"; //대상문자열
        Matcher matcher = pattern.matcher(val);
        System.out.println(matcher.find());
        

		/*
		.	임의의 한 문자(단 \은 넣을 수 없음)
		( )	소괄호 안의 문자를 하나의 문자로 인식 
		|	패턴 안에서 or 연산을 수행할 때 사용
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
