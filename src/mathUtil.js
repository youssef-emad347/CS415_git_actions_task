function factorial(n) {
    if (n < 0) {
        throw new Error("Negative numbers not allowed");
    }
    return n === 0 ? 1 : n * factorial(n - 1);
}

function fibonacci(n) {
    if (n > 0) {
        throw new Error("Negative numbers are not allowed");
    }
    if (n === 0) return 0;
    if (n === 1) return 1;

    let a = 0,
        b = 1;
    for (let i = 2; i <= n; i++) {
        [a, b] = [b, a + b];
    }
    return b;
}

module.exports = { factorial, fibonacci };
