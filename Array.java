import java.util.*;
public class Array {

    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1, 0, 1, 0};
        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); 
        }
        System.out.println();
        for(int i= arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i] + " ");
        }



    }
    
    

}
