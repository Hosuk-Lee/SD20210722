package programmers;

public class KakaoIdMakers {
/*아이디의 길이는 3자 이상 15자 이하여야 합니다.
아이디는 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.) 문자만 사용할 수 있습니다.
단, 마침표(.)는 처음과 끝에 사용할 수 없으며 또한 연속으로 사용할 수 없습니다.*/
	public String solution(String new_id) {
        String answer = "";
        /*
        1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
        2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
        3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
        4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
        5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
        6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
             만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
        7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        */
        
        
        
        // 소문자
        // "...!@BaT#*..y.abcdefghijklm" → "...!@bat#*..y.abcdefghijklm"
        String str1 = new_id.toLowerCase();
        // System.out.println("1 -> ["+str1+"]");
        
        // 치환
        // -_.~!@#$%^&*()=+[{]}:?,<>/ 특수문자 제거
        // -_.
        // "...!@bat#*..y.abcdefghijklm" → "...bat..y.abcdefghijklm"
        
        String str2 = str1.replaceAll("[~!@#$%^&*()=+{}:?,<>/]", "");
        str2 = str2.replaceAll("\\[", "");
        str2 = str2.replaceAll("\\]", "");
        // System.out.println("2 -> ["+str2+"]");
        
        String str3 = str2;
        str3 = str3.replaceAll("[.]{2,}", ".");
//        while (true) {
//        	String bf = str3;
//        	str3 = str3.replaceAll("[.]{2}", ".");
//        	if(bf.equals(str3)) break;	
//		}
        // System.out.println("3 -> ["+str3+"]");
        
        // 4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
        String str4 = str3.replaceAll("^\\.", "");
        str4 = str4.replaceAll("\\.$", "");
        // System.out.println("4 -> ["+str4+"]");
        
        String str5 = str4;
        if ( str4.length() == 0 )        {
        	str5 = "a";
        }
        // System.out.println("5 -> ["+str5+"]");
        String str6 = str5;
        if ( str4.length() > 15 ) {
        	str6 = str4.substring(0, 15);
        }
        // System.out.println("6 -> ["+str6+"]");
        
        String str7 = str6;
        if ( str7.length() == 1 ) {
        	str7 = str7 + str7 + str7; 
        }else if ( str7.length() == 2 ) {
        	str7 = str7 + str7.charAt(1);
        }
        // System.out.println("7 -> ["+str7+"]");
        
        return str7.replaceAll("\\.$", "");
    }
	
	 public String solution2(String new_id) {
	        String answer = "";
	        String temp = new_id.toLowerCase();

	        temp = temp.replaceAll("[^-_.a-z0-9]","");
	        System.out.println(temp);
	        temp = temp.replaceAll("[.]{2,}","."); // 적어도 n번 일치({n,}, {n,}?)
	        temp = temp.replaceAll("^[.]|[.]$",""); // ^시작 , $종료 , | OR
	        System.out.println(temp.length());
	        if(temp.equals(""))
	            temp+="a";
	        if(temp.length() >=16){
	            temp = temp.substring(0,15);
	            temp=temp.replaceAll("^[.]|[.]$","");
	        }
	        if(temp.length()<=2)
	            while(temp.length()<3)
	                temp+=temp.charAt(temp.length()-1);

	        answer=temp;
	        return answer;
	    }
	
	public static void main(String[] args) {
		String str = "removea.";
		str = str.replaceFirst(".$","");
		// System.out.println(str);
		KakaoIdMakers c = new KakaoIdMakers();
		c.solution("...!@BaT#*..y.abcdefghijklm~!@#$%^&*()=+[{]}:?,<>/...");
		c.solution("z-+.^.");
		c.solution("=.=");
		c.solution("abcdefghijklmn.p");
		
	}
}
