package edu.kis.vh.nursery.list;

public class IntLinkedList implements ListInterface {

	private Node last;

	@Override
	public void countIn(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}
	@Override
	public boolean callCheck() {
		return last == null;
	}
	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public int peekaboo() {
		if (callCheck())
			return ERR_VAL;
		return last.value;
	}

	@Override
	public int countOut() {
		if (callCheck())
			return ERR_VAL;
		int ret = last.value;
		last = last.prev;
		return ret;
	}

}
