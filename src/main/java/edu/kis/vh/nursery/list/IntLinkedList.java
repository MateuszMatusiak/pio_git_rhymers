package edu.kis.vh.nursery.list;

public class IntLinkedList implements ListInterface {

	private Node last;

	@Override
	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}
	@Override
	public boolean isEmpty() {
		return last == null;
	}
	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public int lastElementValue() {
		if (isEmpty())
			return ERR_VAL;
		return last.value;
	}

	@Override
	public int pop() {
		if (isEmpty())
			return ERR_VAL;
		int ret = last.value;
		last = last.prev;
		return ret;
	}

}
