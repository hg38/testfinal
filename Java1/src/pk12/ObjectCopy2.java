package pk12;

public class ObjectCopy2 {
public static void main(String[] args) {
	Book[] bookArray1=new Book[3];
	Book[] bookArray2=new Book[3];
	
	bookArray1[0]=new Book("태백산맥"," 조경례");
	bookArray1[1]=new Book("데미안"," 헤르만 헤세");
	bookArray1[2]=new Book("어떻게 살 것인가"," 유시민");
	
	bookArray2[0]=new Book(); //객체 직접 생성
	bookArray2[1]=new Book();
	bookArray2[2]=new Book();
	
	bookArray2[0].setbookname(bookArray1[0].getbookname());
	bookArray2[1].setautor(bookArray1[0].getautor());
	
	
	
}
}
