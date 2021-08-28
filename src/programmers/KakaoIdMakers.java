package programmers;

public class KakaoIdMakers {
/*���̵��� ���̴� 3�� �̻� 15�� ���Ͽ��� �մϴ�.
���̵�� ���ĺ� �ҹ���, ����, ����(-), ����(_), ��ħǥ(.) ���ڸ� ����� �� �ֽ��ϴ�.
��, ��ħǥ(.)�� ó���� ���� ����� �� ������ ���� �������� ����� �� �����ϴ�.*/
	public String solution(String new_id) {
        String answer = "";
        /*
        1�ܰ� new_id�� ��� �빮�ڸ� �����Ǵ� �ҹ��ڷ� ġȯ�մϴ�.
        2�ܰ� new_id���� ���ĺ� �ҹ���, ����, ����(-), ����(_), ��ħǥ(.)�� ������ ��� ���ڸ� �����մϴ�.
        3�ܰ� new_id���� ��ħǥ(.)�� 2�� �̻� ���ӵ� �κ��� �ϳ��� ��ħǥ(.)�� ġȯ�մϴ�.
        4�ܰ� new_id���� ��ħǥ(.)�� ó���̳� ���� ��ġ�Ѵٸ� �����մϴ�.
        5�ܰ� new_id�� �� ���ڿ��̶��, new_id�� "a"�� �����մϴ�.
        6�ܰ� new_id�� ���̰� 16�� �̻��̸�, new_id�� ù 15���� ���ڸ� ������ ������ ���ڵ��� ��� �����մϴ�.
             ���� ���� �� ��ħǥ(.)�� new_id�� ���� ��ġ�Ѵٸ� ���� ��ġ�� ��ħǥ(.) ���ڸ� �����մϴ�.
        7�ܰ� new_id�� ���̰� 2�� ���϶��, new_id�� ������ ���ڸ� new_id�� ���̰� 3�� �� ������ �ݺ��ؼ� ���� ���Դϴ�.
        */
        
        
        
        // �ҹ���
        // "...!@BaT#*..y.abcdefghijklm" �� "...!@bat#*..y.abcdefghijklm"
        String str1 = new_id.toLowerCase();
        // System.out.println("1 -> ["+str1+"]");
        
        // ġȯ
        // -_.~!@#$%^&*()=+[{]}:?,<>/ Ư������ ����
        // -_.
        // "...!@bat#*..y.abcdefghijklm" �� "...bat..y.abcdefghijklm"
        
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
        
        // 4�ܰ� new_id���� ��ħǥ(.)�� ó���̳� ���� ��ġ�Ѵٸ� �����մϴ�.
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
	        temp = temp.replaceAll("[.]{2,}","."); // ��� n�� ��ġ({n,}, {n,}?)
	        temp = temp.replaceAll("^[.]|[.]$",""); // ^���� , $���� , | OR
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
