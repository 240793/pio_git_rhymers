package edu.kis.vh.nursery;

/**
 * klasa pozwala na dodawanie i usuwanie liczb na stos sprawdzając poprawność wieży hanoi
 * elementy nie spełniające założeń wieży hanoi nie są dodawane.
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    /**
     * metoda służy to pozyskania ilości elementów odrzuconych, nie spełniejących założeń wieży hanoi
     * @return liczba odrzuconych elementów
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * metoda dodaje do stosu nowy element o ile spełnia wymagania wieży hanoi
     * @param in liczba do umieszczenia na stosie
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
