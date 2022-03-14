package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntArrayStack;
import edu.kis.vh.nursery.list.IntLinkedList;
import edu.kis.vh.nursery.list.ListInterface;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final ListInterface arr;

    public FIFORhymer(ListInterface arr) {
        this.arr = arr;
    }

    @Override
    public int countOut() {
        while (!callCheck())
            arr.push(super.countOut());

        int ret = arr.pop();

        while (!arr.isEmpty())
            countIn(arr.pop());

        return ret;
    }
}
