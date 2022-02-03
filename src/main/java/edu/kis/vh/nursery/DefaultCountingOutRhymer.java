package edu.kis.vh.nursery;


import edu.kis.vh.nursery.list.IntArrayStack;
import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer {
    IntLinkedList arr;

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

    public int peekaboo() {
        return arr.peekaboo();
    }

    public int countOut() {
        return arr.countOut();
    }
}
