package algorithm;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Review_01 {
	
	private String strArr[] = null;
	private long cntArr[] = null;
	private long count=0;
	
	public long solution(int N,int a,int b,int c) {
		strArr = new String[N];
		cntArr = new long[N];
		s(1,N,a,b,c);
		return count;
	}

	// N�������� ž�� �ϼ��Ǹ� ����Ǽ��� �����ϴ� ��� �˰���
	private void s(int f,int N,int a,int b,int c) {
		
		int nf = f+1; // Next Floor
		
		if ( f>N ) {
			long tmp = 1;
			for (int i = 0; i < cntArr.length; i++) {
				tmp *= cntArr[i]; // 1��-N�������� ����Ǽ� ���
			}
			// count ����
			count += tmp;
			print(tmp);
			return;
		}
		
		boolean[] chk = null;
		// 1 ���� ������ �������� Check
		chk = check(f, nf, a, b, c, 1);
		for (int i = 0; i < chk.length; i++) {
			if ( chk[i] ) {
				cntArr[f-1]=1; // n���� ���ڿ� n���� �ߺ��ϴ� ���ڰ� ������� ����Ǽ� n!/n!
				if ( i==0 ) { strArr[f-1]=fill("a", f); s(nf,N,a-f,b  ,c  ); }
				if ( i==1 ) { strArr[f-1]=fill("b", f); s(nf,N,a  ,b-f,c  ); }
				if ( i==2 ) { strArr[f-1]=fill("c", f); s(nf,N,a  ,b  ,c-f); }
			}
		}
		
		// 2 ���� ������ �������� Check
		if ( f%2 == 0 ) {
			chk = check(f, nf, a, b, c, 2);
			for (int i = 0; i < chk.length; i++) {
				if ( chk[i] ) {
					int dc=f/2; // decrease count
					cntArr[f-1]=factorial(f)/(factorial(dc)*factorial(dc)); // ����� �� n!/(dc!*dc!)  ( Example, "aabb" .. 4!/(2!2!) 
					if ( i==0 ) { strArr[f-1]=fill("a",dc)+fill("b",dc); s(nf,N,a-dc,b-dc,c   ); }
					if ( i==1 ) { strArr[f-1]=fill("b",dc)+fill("c",dc); s(nf,N,a   ,b-dc,c-dc); }
					if ( i==2 ) { strArr[f-1]=fill("c",dc)+fill("a",dc); s(nf,N,a-dc,b   ,c-dc); }
				}
			}
		}
		
		// 3 ���� ������ �������� Check
		if ( f%3 == 0 ) {
			chk = check(f, nf, a, b, c, 3);
			if ( chk[0] ) {
				int dc=f/3; // decrease count
				cntArr[f-1]=factorial(f)/(factorial(dc)*factorial(dc)*factorial(dc)); // ����� �� n!/(dc!*dc!*dc!)  ( Example, "aabbcc" .. 6!/(2!2!2!) 
				strArr[f-1]=fill("a",dc)+fill("b",dc)+fill("c",dc); s(nf,N,a-dc,b-dc,c-dc); 
			}
		}
		// ���� ������ ���̻� ���� �� ����.
	}
	
	private boolean[] check(int f,int N,int a,int b,int c, int cc) {
		boolean[] chk = {false,false,false};
		if ( f<cc ) return chk;
		
		// ���� ������ �������� / �ʿ��� ����(������/�����)
		int aTmp = a/(f/cc); // 1~3  || 1: a / (6/1) Example ( "aaaaaa" )
		int bTmp = b/(f/cc); // 1~3  || 2: b / (6/2) Example ( "aaa", "bbb" )
		int cTmp = c/(f/cc); // 1~3  || 3: c / (6/3) Example ( "aa", "bb", "cc" )
		
		// ���� ���� 1�̻��̾�� ���� ����
		switch (cc) {
		case 1:
			if ( aTmp>=1) { chk[0]=true; }
			if ( bTmp>=1) { chk[1]=true; }
			if ( cTmp>=1) { chk[2]=true; }
			break;
		case 2:
			if ( aTmp>=1 && bTmp>=1) { chk[0]=true; }
			if ( bTmp>=1 && cTmp>=1) { chk[1]=true; }
			if ( cTmp>=1 && aTmp>=1) { chk[2]=true; }
			break;
		case 3:
			if ( aTmp>=1 && bTmp>=1 && cTmp>=1) { chk[0]=true; }
			break;
		default:
			break;
		}
		
		return chk;
	}
	
	private long factorial(int n) {
		if (n==1) return 1;
		else return n*factorial(n-1);
	}
	
	// DEBUG�� ����� �޼ҵ�(�Լ�)
	private String fill(String str, int len) {
		StringBuffer sb = new StringBuffer(str);
		for (int i = str.length(); i < len; i++) {
			sb.append(str);
		}
		return sb.toString();
	}
	
	private void print(long tmp) {
		String str = "";
		for (int i = 0; i < cntArr.length; i++) {
			str += cntArr[i] + "\t" + strArr[i] + "\n";
		}
		str += "mid : " + tmp + ", tot : " + count + "\n";
		System.out.print(str);
		if ( fileOutYn )try{fw.write(str);fw.flush();} catch(IOException e){}
	}
	
	// File Print
	private boolean fileOutYn = false;
	private FileWriter fw = null;
	public void isFileOut(boolean yn) {
		fileOutYn=yn;
		if ( fileOutYn ) {
			try {fw = new FileWriter(new File("D:/out.txt"));} catch (IOException e) {}	
		}
		else {
			if ( fw != null )	try {fw.close();} catch (IOException e) {}
		}
	}
	
	public static void main(String[] args) {
		Review_01 t = new Review_01();
		t.isFileOut(true);
		t.solution(3,3,3,2);
	}
	
	
}
