package pk12;

public class ObjectCopy2 {
public static void main(String[] args) {
	Book[] bookArray1=new Book[3];
	Book[] bookArray2=new Book[3];
	
	bookArray1[0]=new Book("�¹���"," �����");
	bookArray1[1]=new Book("���̾�"," �츣�� �켼");
	bookArray1[2]=new Book("��� �� ���ΰ�"," ���ù�");
	
	bookArray2[0]=new Book(); //��ü ���� ����
	bookArray2[1]=new Book();
	bookArray2[2]=new Book();
	
	bookArray2[0].setbookname(bookArray1[0].getbookname());
	bookArray2[1].setautor(bookArray1[0].getautor());
	
	
	
}
}
