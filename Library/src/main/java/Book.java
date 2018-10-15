
public class Book extends Libstack {
	String Title;
	long ISBN;
	String Author;

	public Book(String title, long iSBN, String author) {
		super();
		Title = title;
		ISBN = iSBN;
		Author = author;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public long getISBN() {
		return ISBN;
	}

	public void setISBN(long iSBN) {
		ISBN = iSBN;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}
}
