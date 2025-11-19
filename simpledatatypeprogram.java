import java.util.Scanner;

class Main{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int a = sc.nextInt();
        
        System.out.print("Enter a float: ");
        float b = sc.nextFloat();
        
        System.out.print("Enter a double: ");
        double c = sc.nextDouble();
        
        System.out.print("Enter a boolean (true/false): ");
        boolean e = sc.nextBoolean();
        
        System.out.print("Enter a byte: ");
        byte g = sc.nextByte();
        
        System.out.print("Enter a short: ");
        short h = sc.nextShort();
        
        System.out.print("Enter a long: ");
        long i = sc.nextLong();
        
         sc.nextLine();
        
        System.out.print("Enter a single word: ");
        String word = sc.next();
        
        System.out.print("Enter a full line: ");
        String fullLine = sc.nextLine();
        
        System.out.print("Enter a character: ");
        char d = sc.next().charAt(0);
        
        System.out.println("\n--- Your Input ---");
        System.out.println("Integer: " + a);
        System.out.println("Float: " + b);
        System.out.println("Double: " + c);
        System.out.println("Character: " + d);
        System.out.println("Boolean: " + e);
        System.out.println("Single word: " + word);
        System.out.println("Full line: " + fullLine);
        System.out.println("Byte: " + g);
        System.out.println("Short: " + h);
        System.out.println("Long: " + i);
        
        sc.close();
    }
}