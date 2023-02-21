package g_IteratorPattern;

public class Example {
	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(4);
			bookShelf.appendBook(new Book("Around the World in 80 Days"));
			bookShelf.appendBook(new Book("Bible"));
			bookShelf.appendBook(new Book("Cinderella"));
			bookShelf.appendBook(new Book("Daddy-Long-Legs"));

			Iterator it = bookShelf.iterator();
			while (it.hasNext()) {
				Book book = (Book)it.next();
				System.out.println("" + book.getName());
			}

			it = bookShelf.reverseIterator();
			while (it.hasNext()) {
				Book book = (Book)it.next();
				System.out.println("" + book.getName());
			}
		}
}
