package edu.kis.vh.nursery;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Testy jednostkowe dla klasy DefaultCountingOutRhymer.
 */
public class DefaultCountingOutRhymerTest {

    /**
     * Testuje dodawanie i zdejmowanie wartości ze stosu.
     */
    @Test
    void testCountInAndOut() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        rhymer.countIn(5);
        assertEquals(5, rhymer.countOut());
    }

    /**
     * Testuje, czy nowy stos jest pusty.
     */
    @Test
    void testCallCheckTrue() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        assertTrue(rhymer.callCheck());
    }

    /**
     * Testuje, czy stos po dodaniu wartości nie jest pusty.
     */
    @Test
    void testCallCheckFalse() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        rhymer.countIn(1);
        assertFalse(rhymer.callCheck());
    }

    /**
     * Testuje, czy stos staje się pełny po dodaniu 12 elementów.
     */
    @Test
    void testIsFull() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        for (int i = 0; i < 12; i++) {
            rhymer.countIn(i);
        }
        assertTrue(rhymer.isFull());
    }

    /**
     * Testuje, czy peekaboo() zwraca ostatni element bez zdejmowania.
     */
    @Test
    void testPeekaboo() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        rhymer.countIn(7);
        assertEquals(7, rhymer.peekaboo());
        assertEquals(7, rhymer.peekaboo());
    }

    /**
     * Testuje zdejmowanie ze stosu pustego.
     */
    @Test
    void testCountOutOnEmpty() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        assertEquals(-1, rhymer.countOut());
    }

    // Projekt poprawny – testy przechodzą
}
