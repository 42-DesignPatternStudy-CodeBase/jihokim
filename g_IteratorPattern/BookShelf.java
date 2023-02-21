package g_IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class BookShelf extends Aggregator {

	private List<Book> bookList;
	private int maxSize;

	public BookShelf(int size) {
		this.bookList = new ArrayList<>();
		this.maxSize = size;
	}

	public boolean appendBook(Book book) {
		if (this.getLength() == this.maxSize) {
			return false;
		}
		return this.bookList.add(book);
	}

	@Override
	public Book getItem(int index) {
		return this.bookList.get(index);
	}

	@Override
	public int getLength() {
		return this.bookList.size();
	}

	@Override
	public Iterator iterator() {
		return new BookShelfIteratorFactory().createProduct(this, 0);
	}

	@Override
	public Iterator reverseIterator() {
		return new BookShelfIteratorFactory().createProduct(this, 1);
	}
}
