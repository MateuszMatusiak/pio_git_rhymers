package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.ListInterface;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    public HanoiRhymer() {
        super();
    }
    public HanoiRhymer(ListInterface arr)
    {
        super(arr);
    }
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
        super.countIn(in);
    }
}