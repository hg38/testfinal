package pk12;

public class ObjectCopy {
	public static void main(String[] args) {
		Book[] bookArray1=new Book[3];
		Book[] bookArray2=new Book[3];
		
		bookArray1[0]=new Book("�¹���"," �����");
		bookArray1[1]=new Book("���̾�"," �츣�� �켼");
		bookArray1[2]=new Book("��� �� ���ΰ�"," ���ù�");
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for (int i=0; i<bookArray2.length;i++) { //������ ���� Ȯ��
			bookArray2[i].showBookinfo();
		}
		
		bookArray1[0].setbookname("����"); //bookArray1�� ���� ����
		bookArray1[0].setautor("�ڿϼ�");
		
		System.out.println("=====bookArray1=====");
		for(int i=0;i<bookArray1.length;i++) {
			bookArray1[i].showBookinfo();}
		
		System.out.println("=====bookArray2====="); 
		for(int i=0;i<bookArray2.length;i++) { //�ٸ� �������� ��µ� 
			bookArray2[i].showBookinfo();}
	}
}

