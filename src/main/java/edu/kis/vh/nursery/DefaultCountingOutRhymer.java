package edu.kis.vh.nursery;


import edu.kis.vh.nursery.list.IntArrayStack;
import edu.kis.vh.nursery.list.IntLinkedList;
import edu.kis.vh.nursery.list.ListInterface;

public class DefaultCountingOutRhymer {
    private final ListInterface arr;

    public DefaultCountingOutRhymer(ListInterface arr)
    {
        this.arr = arr;
    }
    public DefaultCountingOutRhymer() {
        arr = new IntLinkedList();
    }

    public void countIn(int in) {
        arr.push(in);
    }

    public boolean callCheck() {
        return arr.isEmpty();
    }

    public boolean isFull() {
        return arr.isFull();
    }

    protected int peekaboo() {
        return arr.lastElementValue();
    }

    public int countOut() {
        return arr.pop();
    }

}
