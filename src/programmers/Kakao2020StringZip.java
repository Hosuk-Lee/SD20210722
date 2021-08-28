package programmers;

public class Kakao2020StringZip {
	
	public static int solution(String s) {
        int answer = 0;
        
        // abcabcabcabcdededededede -> 24
        
        // 13
        // 17 8*2 2abcdabcde
        
        // 최대 압축률
        // 17 / 2 = 8 + 1 + MOD
        // 

        // 최대 압축률
        int max = s.length() / 2 ;
        
        int maxR = s.length()/2 + s.length()%2;
        
        String befTmp = "";
        String aftTmp = "";
        
        int srcPos = 0;
        int desPos = 0;
        
        
        int repeatCount = 0;
        String result = "";
        
        for (int i = max; i > 0; i--) {
			System.out.println("i:" + i);
			srcPos = 0;
			while ( true ) {
				desPos = srcPos+i;
				if ( desPos > s.length() ) {
					// 마지막
					if ( repeatCount > 0 ) {
						repeatCount++;
						result += repeatCount + befTmp;
						System.out.println("마지막 ! 결과 Count : " + repeatCount + ":"+result);
					} else {
						result += befTmp;
						System.out.println("마지막 @ 결과 :"+result);
					}
					break;
				}
				aftTmp = s.substring(srcPos, desPos);
				System.out.println("tmp:"+ aftTmp + ":" + srcPos + ":" + desPos);
				
				if ( befTmp.equals(aftTmp) ) {
					repeatCount++;
					System.out.println("압축 Count++");
				} else {
					if ( repeatCount > 0 ) {
						repeatCount++;
						result += repeatCount + befTmp;
						System.out.println("결과 Count : " + repeatCount + ":"+result);
						repeatCount = 0;
					} 
				}
				befTmp = aftTmp;
				srcPos += i;
			}
			
		}
        
        return answer;
    }
	
	public static void main(String[] args) {
		solution("abcabcabcabcdededededede");
	}
	
	/*
	"aabbaccc"	7
	"ababcdcdababcdcd"	9
	"abcabcdede"	8
	"abcabcabcabcdededededede"	14
	"xababcdcdababcdcd"	17
	*/
}
