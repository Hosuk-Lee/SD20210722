package programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KakaoOpenChat {
	public static String[] solution(String[] record) {
        String[] answer = {};
        
        Map<String, String> id = new HashMap<String, String>();
        Map<String, List<Integer>> idx = new HashMap<String, List<Integer>>();
        
        List<String> list = new ArrayList<String>();
        
        
        for (int i = 0; i < record.length; i++) {
			String cmd[] = record[i].split(" ");
			// printArrS(cmd);
			if ( "Enter".equals(cmd[0]) ) {
				if (!cmd[2].equals(id.get(cmd[1]))){
					List<Integer> c = idx.get(cmd[1]);
					if ( c!= null) {
						for (int j=0; j<c.size(); j++) {
							String s = list.get(c.get(j));
							s=s.replaceAll(id.get(cmd[1]), cmd[2]);
							list.set(c.get(j), s);
						}
					}
				}
				
				id.put(cmd[1], cmd[2]);
				list.add(cmd[2]+"님이 들어왔습니다.");
			}
			else if ( "Leave".equals(cmd[0]) ) {
				list.add(id.get(cmd[1])+"님이 나갔습니다.");
			} else {
				// change
				List<Integer> c = idx.get(cmd[1]);
				if ( c!= null) {
					for (int j=0; j<c.size(); j++) {
						String s = list.get(c.get(j));
						s=s.replaceAll(id.get(cmd[1]), cmd[2]);
						list.set(c.get(j), s);
					}
				}
				id.put(cmd[1], cmd[2]);
				continue;
			}
			
			List<Integer> z = idx.get(cmd[1]);
			if ( idx.get(cmd[1]) == null ) {
				z = new ArrayList<>();
			} 
			z.add(list.size()-1);
			idx.put(cmd[1], z);
			
			// System.out.println(list.toString());
			// System.out.println(z);
			
		}
        answer = list.stream().toArray(String[]::new);
        // answer = list.toArray(new String[list.size()]);
        // printArrS(answer);
        return answer;
    }
	
	public static void printArrS(String a[]) {
		System.out.println("Print int String");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] +" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		String s[] = new String[]{
				"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"
		};
		/*
		[
		 "Prodo님이 들어왔습니다."
 		 "Ryan님이 들어왔습니다."
 		 "Prodo님이 나갔습니다."
 		 "Prodo님이 들어왔습니다."]
		*/
		solution(s);
		//String a="Muzi님이 들어왔습니다.";
		//System.out.println(a.substring(0,a.indexOf("님")));
	}
}
