package edu.kis.vh.nursery.list;

public class node {

    private final int value;
    private node prev;
    private node next;

    public node(int i) {
        value = i;
    }

    public int getValue() {
        return value;
    }

    public node getPrev() {
        return prev;
    }

    public void setPrev(node prev) {
        this.prev = prev;
    }

    public node getNext() {
        return next;
    }

    public void setNext(node next) {
        this.next = next;
    }
}
