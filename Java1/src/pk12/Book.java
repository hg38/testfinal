package pk12;

public class Book {
	private String bookname;
	private String author;
	
	public Book() {}
	
	public Book(String bookname, String author) {
		this.bookname=bookname;
		this.author=author;
	}
	void showBookinfo() {
		System.out.println(bookname+author);
	}

	public void setbookname(String bookname) {
		this.bookname=bookname;
		
	}

	public void setautor(String author) {
		this.author=author;
		
	}

	public String getbookname() {
		return bookname;
	}
	
	public String getautor() {
		return author;
	}

}
