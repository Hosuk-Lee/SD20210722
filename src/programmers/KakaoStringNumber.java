package programmers;

public class KakaoStringNumber {
	public static int solution(String s) {
		String ans = "";
		String str1[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		String str2[] = {"0","1","2","3","4","5","6","7","8","9"};
		
		ans = s;
		for (int i=0; i<10; i++) {
			ans = ans.replaceAll(str1[i], str2[i]);
		}
		System.out.println(ans);
        
        return Integer.parseInt(ans);
    }
	
	
	public static void main(String[] args) {
		solution("2three45sixseven");
		/*
		"one4seveneight"	1478
		"23four5six7"	234567
		"2three45sixseven"	234567
		"123"	123
		*/
	}
}
