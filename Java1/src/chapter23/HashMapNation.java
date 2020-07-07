package chapter23;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapNation {
	public static void main(String[] args) {
		
	HashMap<String,Integer>nations=new HashMap<String,Integer>();
	//그만 이 입력될때까지 입력 반복
		Scanner s=new Scanner(System.in);
			
		while(true) {
		System.out.println("나라 이름, 인구 >> ");
		String n=s.next(); 
		if(n.equals("그만")) {
			 break;
		}
		int c=s.nextInt();
		nations.put(n,c);
		}	
		while(true) {
			System.out.println("인구 검색");
			String n1=s.next();
			if(n1.equals("그만")) {
				break;
			}
			System.out.println(nations.get(n1));
	}s.close();
}
	//
}

