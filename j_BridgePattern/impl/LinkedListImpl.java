package j_BridgePattern.impl;

import java.util.LinkedList;

public class LinkedListImpl<T> implements AbstractList<T> {

	private LinkedList<T> list = new LinkedList<T>();

	@Override
	public void addElement(T obj) {
		this.list.add(obj);		
	}

	@Override
	public T deleteElement(int i) {
		return this.list.remove(i);
	}

	@Override
	public int insertElement(T obj, int i) {
		this.list.add(i, obj);
		return this.list.size();
	}

	@Override
	public T getElement(int i) {
		return this.list.get(i);
	}

	@Override
	public int getElementSize() {
		return this.list.size();
	}
	
}
