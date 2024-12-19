package com.control;

import org.junit.jupiter.api.Test;  // Pour JUnit 5
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    void de_retourne_fizz_pour_1() {
        // given
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String result = fizzBuzz.de(1);

        // then
        assertEquals("1",result);
    }
    @Test
    void de_retourne_fizz_pour_2() {
        // given
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String result = fizzBuzz.de(1);

        // then
        assertEquals("2",result);
    }
    @Test
    void de_retourne_fizz_pour_3() {
        // given
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String result = fizzBuzz.de(3);

        // then
        assertEquals("Fizz",result);
    }
    @Test
    void de_retourne_fizz_pour_5() {
        // given
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String result = fizzBuzz.de(5);

        // then
        assertEquals("Buzz",result);
    }
}

