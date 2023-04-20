package fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void answerInt() {
        assertEquals("1", FizzBuzz.fizzbuzz(1));
        assertEquals("2", FizzBuzz.fizzbuzz(2));
        assertEquals("4", FizzBuzz.fizzbuzz(4));
    }

    @Test
    void answerFizz() {
        assertEquals("Fizz", FizzBuzz.fizzbuzz(3));
        assertEquals("Fizz", FizzBuzz.fizzbuzz(6));
    }

    @Test
    void answerBuzz() {
        assertEquals("Buzz", FizzBuzz.fizzbuzz(5));
        assertEquals("Buzz", FizzBuzz.fizzbuzz(10));
    }

    @Test
    void answerFizzBuzz(){
        assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(15));
        assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(30));
    }

}