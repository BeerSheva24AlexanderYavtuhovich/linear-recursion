package telran.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;
import org.junit.jupiter.api.Test;

import static telran.util.RecursionMethods.f;
import static telran.util.RecursionMethods.factorial;
import static telran.util.RecursionMethods.isSubstring;
import static telran.util.RecursionMethods.pow;
import static telran.util.RecursionMethods.square;
import static telran.util.RecursionMethods.sum;

public class RecoursionMethodsTest {
    @Test
    void ftest() {
        f(400);
    }

    @Test
    void factorialTest() {
        assertEquals(6, factorial(3));
        assertEquals(24, factorial(4));
        assertEquals(6, factorial(-3));
    }

    @Test
    void powTest() {
        assertEquals(100, pow(10, 2));
        assertEquals(100, pow(-10, 2));
        assertEquals(1000, pow(10, 3));
        assertEquals(-1000, pow(-10, 3));
        assertThrowsExactly(IllegalArgumentException.class, () -> pow(10, -3));
    }

    @Test
    void sumTest() {
        int[] ar = { 1, 2, 3, 4, 5 };
        assertEquals(15, sum(ar));
    }

    @Test
    void squareTest() {
        assertEquals(0, square(0));
        assertEquals(1, square(1));
        assertEquals(4, square(2));
        assertEquals(9, square(3));

        assertEquals(1, square(-1));
        assertEquals(4, square(-2));
        assertEquals(9, square(-3));

        assertEquals(400, square(20));
        assertEquals(400, square(-20));
        assertEquals(10000, square(100));
        assertEquals(10000, square(-100));
    }

    @Test
    void isSubstringTest() {
        assertEquals(true, isSubstring("", ""));
        assertEquals(false, isSubstring("", "telran"));
        assertEquals(true, isSubstring("telran", ""));
        assertEquals(true, isSubstring("tel ran", "tel"));
        assertEquals(true, isSubstring("tel ran", "ran"));
        assertEquals(true, isSubstring("tel ran", "el ra"));
        assertEquals(false, isSubstring("tel ran", "hello"));
        assertEquals(true, isSubstring("telran", "telran"));
        assertEquals(false, isSubstring("telran", "telra telnrantenlran"));
        assertEquals(true, isSubstring("special @#! characters", "@#!"));
        assertEquals(true, isSubstring("telrantelran", "rantel"));
        assertEquals(true, isSubstring("telrantelran", "antel"));
    }
}
