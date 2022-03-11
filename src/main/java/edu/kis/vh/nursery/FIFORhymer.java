package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;
import edu.kis.vh.nursery.list.ListInterface;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final ListInterface temp = new IntLinkedList();

    public FIFORhymer() {
    }

    @Override
    public int countOut() {
        while (!callCheck())
            temp.push(super.countOut());

        int ret = temp.pop();

        while (!temp.isEmpty())
            countIn(temp.pop());

        return ret;
    }
}
