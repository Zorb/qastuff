import java.util.ArrayList;

class Library {
	private final ArrayList<Book> books;

	public Library() {
		books = loadBooks();
	}

	private ArrayList<Book> loadBooks() {
		return books;
	}

}