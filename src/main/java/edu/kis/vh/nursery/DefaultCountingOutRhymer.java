package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int MINUS_ONE = -1;
    public static final int MAX_SIZE = 12;
    private int[] numbers = new int[MAX_SIZE];

    public int total = MINUS_ONE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == MINUS_ONE;
    }

    public boolean isFull() {
        return total == MAX_SIZE - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return MINUS_ONE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return MINUS_ONE;
        return numbers[total--];
    }

}
