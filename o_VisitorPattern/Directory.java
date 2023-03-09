package o_VisitorPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry {

	private String dirname;
	private int size;
	private ArrayList<Entry> contents = new ArrayList<>();

	public Directory(String name) {
		this.dirname = name;
		this.size = 0;
	}

	@Override
	public Entry add(Entry entry) {
		this.contents.add(entry);
		this.size += entry.getSize();
		return this;
	}

	@Override
	public Iterator<Entry> iterator() throws FileTreatmentException {
		return this.contents.iterator();
	}
	@Override
	public void accept(Visitor v) throws FileTreatmentException { v.visit(this); }
	@Override
	public String getName() { return this.dirname; }
	@Override
	public int getSize() { return this.size; }
	public ArrayList<Entry> getContents() { return this.contents; }

}
