package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.Rhymersfactory;

class RhymersDemo {

    private static final int MAX_RANGE = 15;
    private static final int START_INDEX = 0;
    private static final int VALUE = 20;
    private static final int INDEX = 3;

    public static void main(String[] args) {
        Rhymersfactory factory = new DefaultRhymersFactory();

        runProgram(factory);

    }
// TODO: wyekstraktować osobno wstawianie i usuwanie elementów
    private static void runProgram(Rhymersfactory factory) {
        DefaultCountingOutRhymer[] rhymers = { factory.getStandardRhymer(), factory.getFalseRhymer(),
                factory.getFIFORhymer(), factory.getHanoiRhymer()};

        for (int i = START_INDEX + 1; i < MAX_RANGE; i++)
            for (int j = START_INDEX; j < INDEX; j++)
                rhymers[j].countIn(i);

        java.util.Random rn = new java.util.Random();
        for (int i = START_INDEX + 1; i < MAX_RANGE; i++)
            rhymers[INDEX].countIn(rn.nextInt(VALUE));

        for (int i = START_INDEX; i < rhymers.length; i++) {
            while (!rhymers[i].callCheck())
                System.out.print(rhymers[i].countOut() + "  ");
            System.out.println();
        }

        System.out.println("total rejected is "
                + ((HanoiRhymer) rhymers[INDEX]).reportRejected());
    }

}