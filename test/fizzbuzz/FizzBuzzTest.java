package fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void answer1() {
        assertEquals("1", FizzBuzz.fizzbuzz(1));
    }

    @Test
    void answer2() {
        assertEquals("2", FizzBuzz.fizzbuzz(2));
    }
}