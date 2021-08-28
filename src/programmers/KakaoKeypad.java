package programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class KakaoKeypad {
	
	public String key[][]=
		{{"1","4","7","*"}
		,{"2","5","8","0"}
		,{"3","6","9","#"}}
			;
	public String solution(int[] numbers, String hand) {
        String answer = "";
        
        Map<String, String> hmap = new HashMap<String, String>();
        
        String l[] = {"1","4","7","*"};
        String m[] = {"2","5","8","0"};
        String r[] = {"3","6","9","#"};
        
        // System.out.println(Arrays.binarySearch(l, "1");
        
        // MAP DATA 저장
        for (int i = 0; i < 3; i++) {
			for(int j=0; j<4 ; j++ ) {
				// System.out.print(key[i][j]);
				if     (i==0) hmap.put(key[i][j], "L");
				else if(i==1) hmap.put(key[i][j], "M");
				else if(i==2) hmap.put(key[i][j], "R");
			}
		} 
        
        int l_pos = 3;
        int r_pos = 3;
        boolean l_mid_yn = false;
        boolean r_mid_yn = false;
        for (int i = 0; i < numbers.length; i++) {
			String s = numbers[i]+"";
			//System.out.println("s:"+s+","+hmap.get(s));
			
			if (hmap.get(s).equals("M")) {
				int mid_pos=s.equals("0")? 3 : Arrays.binarySearch(m, s);
				int ld = (l_mid_yn ? 0:1) + Math.abs(mid_pos-l_pos); 
				int rd = (r_mid_yn ? 0:1) + Math.abs(mid_pos-r_pos);

				// System.out.println("Start@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
				// System.out.println("m_pos:"+mid_pos);
				// System.out.println("l_pos:"+l_pos+","+"r_pos:"+r_pos);
				// System.out.println("l_pos:"+l_mid_yn+","+"r_pos:"+r_mid_yn);
				// System.out.println("ld:"+ld+","+"rd:"+rd);
				// System.out.println("Enddd@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
				if (ld < rd ) {
					l_mid_yn = true;
					l_pos=mid_pos;
					answer+="L";
				}else if (ld > rd ) {
					r_mid_yn = true;
					r_pos=mid_pos;
					answer+="R";
				}else {
					//같은경우
					if ( hand.equals("left")) {
						// 왼 주손
						l_mid_yn = true;
						l_pos=mid_pos;
						answer+="L";
					}else {
						// 오 주손
						r_mid_yn = true;
						r_pos=mid_pos;
						answer+="R";
					}
				}
			}else if (hmap.get(s).equals("L")) {
				answer+=hmap.get(s);
				l_pos = Arrays.binarySearch(l, s);
				l_mid_yn = false;
			}else if (hmap.get(s).equals("R")) {
				answer+=hmap.get(s);
				r_pos = Arrays.binarySearch(r, s);
				r_mid_yn = false;
			}
		}
        //System.out.println("-----------");
        //System.out.println(answer);
        return answer;
    }
	
	public static void main(String[] args) {
		//solut
		KakaoKeypad k = new KakaoKeypad();
		// [1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5]	"right"
		// k.solution(new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5},	"right");
		// LRLLLRLLRRL 
		// LRLLLRLLRRL
		k.solution(new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2},	"left");
		// 답:LRLLRRLLLRR
		// 나:LRLLRRLLLRR
		
		// String m[] = {"2","5","8","9"};
		// System.out.println(Arrays.binarySearch(m, "2"));
		// System.out.println(Arrays.binarySearch(m, "5"));
		// System.out.println(Arrays.binarySearch(m, "8"));
		// System.out.println(Arrays.binarySearch(m, "9"));
	}
}
