package codility;
public class Sh01 {
	public static void main(String[] args) {
		String str = "abcd";
		int n = str.length();
		int i = 0;
		System.out.println(str.charAt(i) +":"+ str.substring(0, i) + str.substring(i+1, n)); //0,0 .. 1,4
		i++;
		System.out.println(str.charAt(i) +":"+ str.substring(0, i) + str.substring(i+1, n));
		i++;
		System.out.println(str.charAt(i) +":"+ str.substring(0, i) + str.substring(i+1, n));
		i++;
		System.out.println(str.charAt(i) +":"+ str.substring(0, i) + str.substring(i+1, n));
	}
}
