package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int empty = -1;
    public static final int maxIndex = 11;
    private final int[] numbersArray = new int[maxIndex + 1];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbersArray[++total] = in;
    }

    public boolean callCheck() {
        return total == empty;
    }

    public boolean isFull() {
        return total == maxIndex;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbersArray[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbersArray[total--];
    }

}
// Polecenia alt + -> to skrót forward/back
