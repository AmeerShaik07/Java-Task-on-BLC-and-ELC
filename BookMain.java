package Com.Example;

public class BookMain {
	public static void main(String[] args) {
		Book book = new Book();
		book.setBookDetails("Java Basics", "John Doe", 450.0);
		String res = book.getBookDetails();
		System.out.println(res);
	}
}
