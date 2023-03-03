package Lab_2nd_March;
// Ques 1

public class Library {
	// instance variable
	private long bookId;
	private String bookName;
	private String bookAuthor;
	
	// generating getter setter method
	public long getBookId() {
		return bookId;
	}
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	void addBook() { // method to add book
		System.out.println("Add book "+bookId+" "+bookName+" in stock");	
	}
	void dispanseBook() { // method to remove book
		System.out.println("Remove book HALF GIRLFRIEND from library");
	}
	
}
