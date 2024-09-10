package telran.util;

public class RecursionMethods {
    public static void f(int a) {
        if (a > 3) {
            f(a - 1);
        }
    }

    public static long factorial(int n) {
        // n! = 1 * 2 * 3 ... *n
        if (n < 0) {
            n = -n;
        }
        return n == 0 ? 1 : n * factorial(n - 1);
    }

    /**
     * @param num    - any integer
     * @param degree - any positive
     * @return num - degree
     *         limitations:
     *         1.no cycles
     *         2. arithmetic operators + - are allowed only
     *         3. bitwise operators disallowed
     *         4. no tricks
     */
    public static long pow(int num, int degree) {
        // if (degree < 0) {
        // throw new IllegalArgumentException();
        // }

        // return degree == 0 ? 1 : num * pow(num, degree - 1);
        // TODO
        throw new UnsupportedOperationException();
    }

    public static int sum(int[] array) {
        return sum(array, array.length);

    }

    private static int sum(int[] array, int length) {
        return length == 0 ? 0 : array[length - 1] + sum(array, length - 1);
    }

    /**
     * @param x
     * @return x2
     *         limitations
     *         1. no cycles
     *         2. arithmetic operators only + -
     *         3. no bitwise operators
     *         4. no standart and assitional methods are allowed
     *         5. no additional fields of the class Recursion
     */
    public static int square(int x) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * @param string
     * @param subString
     * @return true if subString is actually substring is of the given
     *         limitations
     *         1. no cycles
     *         2. the allowed methods of class String are
     *         2.1 charAt(int index)
     *         2.2 length()
     *         2.3 subString(int beginIndex)
     */
    public static boolean isSubstring(String string, String subString) {
        // TODO
        throw new UnsupportedOperationException();
    }
}
