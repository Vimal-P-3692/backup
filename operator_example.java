public class operator_example {
    public static void main(String[] args) {
        System.out.println("=== JAVA OPERATORS EXAMPLES ===\n");
        
        // Variables for demonstration
        int a = 10, b = 5;
        boolean x = true, y = false;
        
        // 1. ARITHMETIC OPERATORS
        System.out.println("1. ARITHMETIC OPERATORS:");
        System.out.println("a = " + a + ",, b = " + b);
        System.out.println("Addition (a + b): " + (a + b));
        System.out.println("Subtraction (a - b): " + (a - b));
        System.out.println("Multiplication (a * b): " + (a * b));
        System.out.println("Division (a / b): " + (a / b));
        System.out.println("Modulus (a % b): " + (a % b));
        System.out.println("Increment (++a): " + (++a));
        System.out.println("Decrement (--b): " + (--b));
        System.out.println();
        
        // Reset values
        a = 10; b = 5;
        
        // 2. RELATIONAL/COMPARISON OPERATORS
        System.out.println("2. RELATIONAL/COMPARISON OPERATORS:");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Equal to (a == b): " + (a == b));
        System.out.println("Not equal to (a != b): " + (a != b));
        System.out.println("Greater than (a > b): " + (a > b));
        System.out.println("Less than (a < b): " + (a < b));
        System.out.println("Greater than or equal (a >= b): " + (a >= b));
        System.out.println("Less than or equal (a <= b): " + (a <= b));
        System.out.println();
        
        // 3. ASSIGNMENT OPERATORS
        System.out.println("3. ASSIGNMENT OPERATORS:");
        int num = 20;
        System.out.println("Initial value: " + num);
        num += 5; // num = num + 5
        System.out.println("After += 5: " + num);
        num -= 3; // num = num - 3
        System.out.println("After -= 3: " + num);
        num *= 2; // num = num * 2
        System.out.println("After *= 2: " + num);
        num /= 4; // num = num / 4
        System.out.println("After /= 4: " + num);
        num %= 3; // num = num % 3
        System.out.println("After %= 3: " + num);
        System.out.println();
        
        // 4. LOGICAL OPERATORS
        System.out.println("4. LOGICAL OPERATORS:");
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("Logical AND (x && y): " + (x && y));
        System.out.println("Logical OR (x || y): " + (x || y));
        System.out.println("Logical NOT (!x): " + (!x));
        System.out.println("Logical NOT (!y): " + (!y));
        System.out.println();
        
        // 5. BITWISE OPERATORS
        System.out.println("5. BITWISE OPERATORS:");
        int p = 12; // Binary: 1100
        int q = 10; // Binary: 1010
        System.out.println("p = " + p + " (Binary: " + Integer.toBinaryString(p) + ")");
        System.out.println("q = " + q + " (Binary: " + Integer.toBinaryString(q) + ")");
        System.out.println("Bitwise AND (p & q): " + (p & q) + " (Binary: " + Integer.toBinaryString(p & q) + ")");
        System.out.println("Bitwise OR (p | q): " + (p | q) + " (Binary: " + Integer.toBinaryString(p | q) + ")");
        System.out.println("Bitwise XOR (p ^ q): " + (p ^ q) + " (Binary: " + Integer.toBinaryString(p ^ q) + ")");
        System.out.println("Bitwise NOT (~p): " + (~p));
        System.out.println("Left Shift (p << 2): " + (p << 2) + " (Binary: " + Integer.toBinaryString(p << 2) + ")");
        System.out.println("Right Shift (p >> 2): " + (p >> 2) + " (Binary: " + Integer.toBinaryString(p >> 2) + ")");
        System.out.println();
        
        // 6. UNARY OPERATORS
        System.out.println("6. UNARY OPERATORS:");
        int val = 15;
        System.out.println("Original value: " + val);
        System.out.println("Unary plus (+val): " + (+val));
        System.out.println("Unary minus (-val): " + (-val));
        System.out.println("Pre-increment (++val): " + (++val));
        val = 15; // Reset
        System.out.println("Post-increment (val++): " + (val++));
        System.out.println("Value after post-increment: " + val);
        System.out.println("Pre-decrement (--val): " + (--val));
        val = 15; // Reset
        System.out.println("Post-decrement (val--): " + (val--));
        System.out.println("Value after post-decrement: " + val);
        System.out.println();
        
        // 7. TERNARY OPERATOR (Conditional Operator)
        System.out.println("7. TERNARY OPERATOR:");
        int age = 18;
        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Age: " + age);
        System.out.println("Status: " + result);
        
        int max = (a > b) ? a : b;
        System.out.println("Maximum of " + a + " and " + b + " is: " + max);
        System.out.println();
        
        // 8. INSTANCEOF OPERATOR
        System.out.println("8. INSTANCEOF OPERATOR:");
        String str = "Hello Java";
        Object obj = str;
        System.out.println("str instanceof String: " + (str instanceof String));
        System.out.println("obj instanceof String: " + (obj instanceof String));
        System.out.println("str instanceof Object: " + (str instanceof Object));
        System.out.println();
        
        // 9. COMPOUND ASSIGNMENT WITH BITWISE
        System.out.println("9. COMPOUND ASSIGNMENT WITH BITWISE:");
        int bitVal = 8;
        System.out.println("Initial value: " + bitVal);
        bitVal &= 5; // bitVal = bitVal & 5
        System.out.println("After &= 5: " + bitVal);
        bitVal = 8; // Reset
        bitVal |= 5; // bitVal = bitVal | 5
        System.out.println("After |= 5: " + bitVal);
        bitVal = 8; // Reset
        bitVal ^= 5; // bitVal = bitVal ^ 5
        System.out.println("After ^= 5: " + bitVal);
        bitVal <<= 2; // bitVal = bitVal << 2
        System.out.println("After <<= 2: " + bitVal);
        bitVal >>= 1; // bitVal = bitVal >> 1
        System.out.println("After >>= 1: " + bitVal);
        System.out.println();
        
        // 10. OPERATOR PRECEDENCE EXAMPLE
        System.out.println("10. OPERATOR PRECEDENCE EXAMPLE:");
        int result1 = 10 + 5 * 2; // Multiplication first, then addition
        int result2 = (10 + 5) * 2; // Parentheses change precedence
        System.out.println("10 + 5 * 2 = " + result1);
        System.out.println("(10 + 5) * 2 = " + result2);
        
        boolean condition1 = false;
        boolean condition2 = true;
        boolean logicalResult = condition2 || condition1 && false; // && has higher precedence than ||
        System.out.println("condition2 || condition1 && false = " + logicalResult);
        
        System.out.println("\n=== END OF OPERATORS DEMO ===");
    }
}
