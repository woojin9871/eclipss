package Ex02;

public class Book {

	static int isbn;
	static String title;
	static String writer;
	static String content;
	static int price;

	public Book(String string, String string2, String string3, String string4, String string5) {
		super();
	}

	public static int getIsbn() {
		return isbn;
	}

	public static void setIsbn(int isbn) {
		Book.isbn = isbn;
	}

	public static String getTitle() {
		return title;
	}

	public static void setTitle(String title) {
		Book.title = title;
	}

	public static String getWriter() {
		return writer;
	}

	public static void setWriter(String writer) {
		Book.writer = writer;
	}

	public static String getContent() {
		return content;
	}

	public static void setContent(String content) {
		Book.content = content;
	}

	public static int getPrice() {
		return price;
	}

	public static void setPrice(int price) {
		Book.price = price;
	}

	@Override
	public String toString() {
		return "Book [toString()=" + super.toString() + "]";
	}


}
