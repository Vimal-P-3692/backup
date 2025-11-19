import java.util.*;
public class arrayconcepts {
    public static void main(String[] args) {
        
        int[] numbers = {10, 20, 30, 40, 50};
        
        for (int i=0;i<numbers.length;i++) {
            
            for(int j=1;j<numbers.length;j++)
            {
                if(numbers[i]<numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        for(int i=0;i<numbers.length;i++) {
            System.out.print(numbers[i] + " ");
        }


        
    }

}
