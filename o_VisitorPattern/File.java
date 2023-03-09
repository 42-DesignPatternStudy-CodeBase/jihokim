package o_VisitorPattern;

public class File extends Entry {

	private String filename;
	private int size;

	public File(String name, int size) {
		this.filename = name;
		this.size = size;
	}

	@Override
	public void accept(Visitor v) { v.visit(this); }
	@Override
	public String getName() { return this.filename; }
	@Override
	public int getSize() { return this.size; }

}
