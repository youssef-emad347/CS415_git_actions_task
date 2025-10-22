package com.example;

public class MathUtils {
    public static int factorial(int n) {
    if (n < 0) {
        throw new IllegalArgumentException("Negative input: " + n);
    }
    int result = 1;
    for (int i = 2; i <= n; i++) {
        result *= i;
    }
    return result;
}

public static int fibonacci(int n) {
    if (n < 0) {
        throw new IllegalArgumentException("Negative input: " + n);
    }
    if (n == 0) return 0;
    if (n == 1) return 1;
    int a = 0, b = 1;
    for (int i = 2; i <= n; i++) {
        int temp = a + b;
        a = b;
        b = temp;
    }
    return b;
}
}
