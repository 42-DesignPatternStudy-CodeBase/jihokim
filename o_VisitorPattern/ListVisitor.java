package o_VisitorPattern;

import java.util.Iterator;

public class ListVisitor extends Visitor {

    private String currentdir = "";

	@Override
	public void visit(File file) {
		final String msg = this.currentdir + "/" + file.getName();
		System.out.println(msg);
	}

	@Override
	public void visit(Directory directory) throws FileTreatmentException {
		final String msg = this.currentdir + "/" + directory.getName();
		System.out.println(msg);
		String temp = this.currentdir;
		this.currentdir += "/" + directory.getName();
		Iterator<Entry> it = directory.iterator();
		while (it.hasNext()) {
			it.next().accept(this);
		}
		this.currentdir = temp;
	}
	
}
