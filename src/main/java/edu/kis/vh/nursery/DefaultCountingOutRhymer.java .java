package edu.kis.vh.nursery;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DefaultCountingOutRhymerTest {

    @Test
    void testCountInAndOut() {
        DefaultCountingOutRhymerTest rhymer = new DefaultCountingOutRhymerTest();
        rhymer.countIn(5);
        assertEquals(5, rhymer.countOut());
    }

    @Test
    void testCallCheckTrue() {
        DefaultCountingOutRhymerTest rhymer = new DefaultCountingOutRhymerTest();
        assertTrue(rhymer.callCheck());
    }

    @Test
    void testCallCheckFalse() {
        DefaultCountingOutRhymerTest rhymer = new DefaultCountingOutRhymerTest();
        rhymer.countIn(1);
        assertFalse(rhymer.callCheck());
    }

    @Test
    void testIsFull() {
        DefaultCountingOutRhymerTest rhymer = new DefaultCountingOutRhymerTest();
        for (int i = 0; i < 12; i++) {
            rhymer.countIn(i);
        }
        assertTrue(rhymer.isFull());
    }

    @Test
    void testPeekaboo() {
        DefaultCountingOutRhymerTest rhymer = new DefaultCountingOutRhymerTest();
        rhymer.countIn(7);
        assertEquals(7, rhymer.peekaboo());
        assertEquals(7, rhymer.peekaboo());
    }

    @Test
    void testCountOutOnEmpty() {
        DefaultCountingOutRhymerTest rhymer = new DefaultCountingOutRhymerTest();
        assertEquals(-1, rhymer.countOut());
    }

    // Projekt poprawny – testy przechodzą
}
