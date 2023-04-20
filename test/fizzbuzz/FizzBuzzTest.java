package fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void test() {
        assertEquals("1", FizzBuzz.fizzbuzz(1));
    }
}