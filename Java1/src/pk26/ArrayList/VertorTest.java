package pk26.ArrayList;

import java.util.Vector;

public class VertorTest {
	public static void main(String[] args) {
		Object obj;
		//크기
		Vector<Object> vec=new Vector<Object>(2);
		obj=10;
		vec.addElement(obj); //엘리먼트 추가
		//vector 용량 수 
		System.out.println(" 용량 #1: "+vec.capacity());
		//vector 엘리먼트 수 
		System.out.println(" 크기#2: "+vec.size());
		obj="Hi";
		vec.addElement(obj );//엘리먼트 추가
		System.out.println(" 용량#2: " +vec.capacity());
		System.out.println(" 크기#2: "+vec.size());
		obj="Nice day";
		vec.addElement(obj);
}

}
