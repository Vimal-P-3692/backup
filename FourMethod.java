public class FourMethod {
    public void Addition(int a, int b) {
        int c = a + b;
        System.out.println("Addition: " + c);
    }
    public void Subtraction(int a, int b) {
        int c = a - b;
        System.out.println("Subtraction: " + c);
    }
    public void Multiplication(int a, int b) {
        int c = a * b;
        System.out.println("Multiplication: " + c);
    }
    public void Division(int a, int b) {
        if (b != 0) {
            double c = (double) a / b;
            System.out.println("Division: " + c);
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }
    
    
}
class Main {
    public static void main(String[] args) {
        FourMethod calculator = new FourMethod();
        
        
        calculator.Addition(10, 5);
        calculator.Subtraction(10, 5);
        calculator.Multiplication(10, 5);
        calculator.Division(10, 5);
        
       
        calculator.Division(10, 0);
    }
}