package chapter23;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapNation {
	public static void main(String[] args) {
		
	HashMap<String,Integer>nations=new HashMap<String,Integer>();
	//�׸� �� �Էµɶ����� �Է� �ݺ�
		Scanner s=new Scanner(System.in);
			
		while(true) {
		System.out.println("���� �̸�, �α� >> ");
		String n=s.next(); 
		if(n.equals("�׸�")) {
			 break;
		}
		int c=s.nextInt();
		nations.put(n,c);
		}	
		while(true) {
			System.out.println("�α� �˻�");
			String n1=s.next();
			if(n1.equals("�׸�")) {
				break;
			}
			System.out.println(nations.get(n1));
	}s.close();
}
	//
}

