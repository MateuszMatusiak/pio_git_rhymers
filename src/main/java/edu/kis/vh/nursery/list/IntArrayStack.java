package edu.kis.vh.nursery.list;

public class IntArrayStack implements ListInterface {
    public IntArrayStack(int size) {
        IntArrayStack.size = size ;
    }
    public static int size=12;
    private final int[] numbers = new int[size] ;
    public int total = -1;

    @Override
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    @Override
    public boolean callCheck() {
        return total == -1;
    }

    @Override
    public boolean isFull() {
        return total == size-1;
    }

    @Override
    public int peekaboo() {
        if (callCheck())
            return errVal;
        return numbers[total];
    }

    @Override
    public int countOut() {
        if (callCheck())
            return errVal;
        return numbers[total--];
    }
}
