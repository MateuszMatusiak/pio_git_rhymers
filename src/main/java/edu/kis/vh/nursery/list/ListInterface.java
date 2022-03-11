package edu.kis.vh.nursery.list;

public interface ListInterface {
    void push(int i);
    boolean isEmpty();
    boolean isFull();
    int lastElementValue();
    int pop();
    final int ERR_VAL = 0;
}
