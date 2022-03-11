package edu.kis.vh.nursery.list;

public class IntArrayStack implements ListInterface {

    public final int size;
    private final int[] numbers;
    public int total = -1;
    public final int EMPTY = -1;
    public final int CAPACITY;

    public IntArrayStack(int size) {
        this.size = size;
        this.numbers = new int[size];
        this.CAPACITY = size-1;
    }

    @Override
    public void push(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    @Override
    public boolean isEmpty() {
        return total == EMPTY;
    }

    @Override
    public boolean isFull() {
        return total == CAPACITY;
    }

    @Override
    public int lastElementValue() {
        if (isEmpty())
            return ERR_VAL;
        return numbers[total];
    }

    @Override
    public int pop() {
        if (isEmpty())
            return ERR_VAL;
        return numbers[total--];
    }
}
