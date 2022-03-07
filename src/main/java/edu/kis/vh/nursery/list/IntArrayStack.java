package edu.kis.vh.nursery.list;

public class IntArrayStack implements ListInterface {

    public final int size;
    private final int[] numbers;
    public int total = -1;

    public IntArrayStack(int size) {
        this.size = size;
        this.numbers = new int[size];
    }

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
        return total == size - 1;
    }

    @Override
    public int peekaboo() {
        if (callCheck())
            return ERR_VAL;
        return numbers[total];
    }

    @Override
    public int countOut() {
        if (callCheck())
            return ERR_VAL;
        return numbers[total--];
    }
}
