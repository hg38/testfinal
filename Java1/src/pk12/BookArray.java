package pk12;

public class BookArray {
	public static void main(String[] args) {
		Book[] library=new Book[5];
		
		library[0]=new Book("태백산맥","조경례");
		library[1]=new Book("데미안","헤르만 헤세");
		library[2]=new Book("어떻게 살 것인가","유시민");
		library[3]=new Book("파과","구병모");
		library[4]=new Book("나쁜 소년이 서 있다","허연");
		
		for(int i=0;i<library.length;i++) {
			library[i].showBookinfo();
		}
			System.out.println();
			
		for(int i=0;i<library.length;i++) {
			System.out.println(library[i]);
			
		}
	}

}
