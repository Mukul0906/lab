package Lab_2nd_March;

 // main class for library
public class Main {
	 public static void main(String[] args) {
		Library lib=new Library(); // creating object of library
// setting values
		lib.setBookId(123456);
		lib.setBookName("Doglapan");
		lib.setBookAuthor("Ashneer Grover");
// getting values
		lib.addBook();
		System.out.println("Book Serial No.: "+lib.getBookId());
		System.out.println("Book Name: "+lib.getBookName());
		System.out.println("Author Name: "+lib.getBookAuthor());
		lib.dispanseBook();
	 }
}
