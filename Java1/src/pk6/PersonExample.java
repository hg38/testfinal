package pk6;

public class PersonExample {
	public static void main(String[] args) {
		Person p1=new Person("123456-1234567","È«±æµ¿");
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		System.out.println();
		
		p1.name="È«»ï";
		//p1.nation="";
;		//p1.ssn="23456789-12345689";
	}
}
