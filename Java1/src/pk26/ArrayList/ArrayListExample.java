package pk26.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
public static void main(String[] args) {
	
	List<String> list=new ArrayList<String>();
	list.add("Java");
	list.add("JDBC");
	list.add("Servlet/JSP");
	list.add("DATABASE");
	list.add("Spring");
	//
	//���Ƚ��	
	//for -> size. get. 
	
	int size=list.size();
	System.out.println("��� Ƚ��: " + size);
		
	for(int i=0;i<list.size();i++) {
		String str=list.get(i);
		System.out.println(i+": "+str);
	}

	System.out.println("===============");
	
	//����
	//list.remove(int index), remove(Object)
	
	list.remove(2);
	list.remove("Spring");
	
	//for
	
	for(int i=0;i<list.size();i++) {
		String str=list.get(i);
		System.out.println(i+": "+str);
	}
	
}
}
