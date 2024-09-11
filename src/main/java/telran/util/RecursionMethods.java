package telran.util;

public class RecursionMethods {
    public static void f(int a) {
        if (a > 3) {
            f(a - 1);
        }
    }

    public static long factorial(int n) {
        if (n < 0) {
            n = -n;
        }
        return n == 0 ? 1 : n * factorial(n - 1);
    }

    public static long pow(int num, int degree) {
        if (degree < 0) {
            throw new IllegalArgumentException();
        }
        return degree == 0 ? 1 : multiply(num, pow(num, degree - 1));
    }

    private static long multiply(int num, long degree) {
        long res;

        if (num == 0 || degree == 0) {
            res = 0;
        } else if (num > 0) {
            res = degree + multiply(num - 1, degree);
        } else {
            res = -multiply(-num, degree);
        }

        return res;
    }

    public static int sum(int[] array) {
        return sum(array, array.length);
    }

    private static int sum(int[] array, int length) {
        return length == 0 ? 0 : array[length - 1] + sum(array, length - 1);
    }

    public static int square(int x) {
        return (x == 0) ? 0 : (x < 0) ? square(-x) : square(x - 1) + x + x - 1;
    }

    public static boolean isSubstring(String string, String subString) {
        return subString.length() > string.length()
                ? false
                : isSubstring(string, subString, 0);
    }

    private static boolean isSubstring(String string, String subString, int strIndex) {
        return strIndex > string.length() - subString.length()
                ? false
                : isSubstring(string, subString, strIndex, 0)
                        || isSubstring(string, subString, strIndex + 1);
    }

    private static boolean isSubstring(String string, String subString, int strIndex, int subStrIndex) {
        return subStrIndex == subString.length()
                ? true
                : (strIndex >= string.length() || string.charAt(strIndex) != subString.charAt(subStrIndex))
                        ? false
                        : isSubstring(string, subString, strIndex + 1, subStrIndex + 1);
    }
}
