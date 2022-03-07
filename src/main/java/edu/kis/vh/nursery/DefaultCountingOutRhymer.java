package edu.kis.vh.nursery;


import edu.kis.vh.nursery.list.IntArrayStack;
import edu.kis.vh.nursery.list.IntLinkedList;
import edu.kis.vh.nursery.list.ListInterface;

public class DefaultCountingOutRhymer {
    private final ListInterface arr;

    public DefaultCountingOutRhymer() {
        arr = new IntLinkedList();
    }

    public void countIn(int in) {
        arr.countIn(in);
    }

    public boolean callCheck() {
        return arr.callCheck();
    }

    public boolean isFull() {
        return arr.isFull();
    }

    protected int peekaboo() {
        return arr.peekaboo();
    }

    public int countOut() {
        return arr.countOut();
    }

}
