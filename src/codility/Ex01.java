package codility;

public class Ex01 {
	
	
	public static int solution ( int number) {
		int x = 0;
		
		String binary = "";
		
		while ( (x = number / 2) > 1 ) {
			int mod = number % 2;
			System.out.println("Mod" + mod);
			if ( mod == 0 ) {
				binary = binary + "0";
			} else {
				binary = binary + "1";
			}
			number = x;
			System.out.println(x);
			System.out.println("bin"+binary);
			
		}
		System.out.println("bin"+binary);
		
		return 0;
	}
	
	public static void main(String[] args) {
		System.out.println( solution(9) );
	}
}
