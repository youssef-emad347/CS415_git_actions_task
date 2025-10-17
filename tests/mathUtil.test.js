const { factorial, fibonacci } = require("../src/mathUtil.js");

describe("Math Utils", () => {
    test("factorial", () => {
        expect(factorial(5)).toBe(120);
        expect(factorial(0)).toBe(1);
        expect(() => factorial(-1)).toThrow("Negative numbers not allowed");
    });

    test("fibonacci", () => {
        expect(fibonacci(0)).toBe(0);
        expect(fibonacci(1)).toBe(1);
        expect(fibonacci(5)).toBe(5);
        expect(fibonacci(10)).toBe(55);
        expect(() => fibonacci(-3)).toThrow("Negative numbers are not allowed");
    });
});
