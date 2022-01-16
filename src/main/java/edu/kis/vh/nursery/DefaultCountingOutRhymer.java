package edu.kis.vh.nursery;


public class DefaultCountingOutRhymer {
    IntArrayStack arr;

    public DefaultCountingOutRhymer() {
        arr = new IntArrayStack();
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
