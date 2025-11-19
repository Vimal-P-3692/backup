import java.util.*;
public class ArmStrongNum {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int originalNum = num; // Store the original number for comparison
        int Count = 0;
        
        // Count the number of digits
        while (num > 0) {
            num = num / 10;
            Count++;
        }

        num = originalNum; // Reset num to original value
        int ArmStrongNumber = 0;
        int last = 0;
        
        // Calculate Armstrong number
        while(num > 0)
        {
            last = num % 10;
            int power = 1;
            
            // Calculate last^Count (not last^last)
            for(int i = 1; i <= Count; i++)
            {
                power = power * last;
            }
            
            ArmStrongNumber = ArmStrongNumber + power;
            num = num / 10;
        }
        
        System.out.println("Armstrong sum: " + ArmStrongNumber);
        System.out.println("Original number: " + originalNum);
        
        if (ArmStrongNumber == originalNum) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
        
        sc.close();
    }
}
