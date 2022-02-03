package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    public static final int empty = 0;
    int totalRejected = empty;

    public int reportRejected() {
        return totalRejected;
    }

    public HanoiRhymer() {
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}