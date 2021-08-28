package Question_SD_Re;

public class Combination {

	// 중복제거 자리수만큼
	public static String c1 ( int cnt, String pre, String str) {
		
		int len = pre.length();
		if(len==cnt) {
			System.out.println("result:"+pre);
			return pre;
		}
		
		for (int i = 0; i < str.length(); i++) {
			String p = str.substring(i, i+1);
			String s = str.substring(i+1,str.length());
			c1(cnt,pre+p,s);
		}
		return "";
		
	}
	
	// 모든문자열
	public static String c2 ( String pre, String str) {
		
		int len = str.length();
		if(len==0) {
			System.out.println("result:"+pre);
			return pre;
		}
		
		for (int i = 0; i < len; i++) {
			String p = pre+str.substring(i, i+1);
			
			String s = str.substring(0,i) + str.substring(i+1,str.length());
			c2(p,s);
		}
		return "";
		
	}
	
	public static void main(String[] args) {
		System.out.println("abcd".substring(0,1));
		System.out.println("abcd".substring(2,4));
		
		
		// c1(1,"","abc");
		// c1(2,"","abc");
		// c1(3,"","abc");
		
		c2("","abc");
	}
}
