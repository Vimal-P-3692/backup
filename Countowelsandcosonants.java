import java.lang.*;


public class Countowelsandcosonants {
    public static void main(String [] args) {
        String input = "Hello World";
        int vowels = 0;
        int consonants = 0;

        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);


        for(int i=input.length()-1; i>=0; i--) {
            System.out.print(input.charAt(i));
        }
    }
    
}

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Handle cases where k > n
        
        if(k == 0) return; // No rotation needed
        
        int[] arr = new int[n];
        
        // Copy elements to new positions
        for(int i = 0; i < n; i++) {
            arr[(i + k) % n] = nums[i];
        }
        
        // Copy back to original array
        for(int i = 0; i < n; i++) {
            nums[i] = arr[i];
        }
    }
}


// 1. Diamond pattern
// 2. Hallow pattern 
// 3. Right triangle pattern
// 4. Sum of array elements 
// 5. Reverse the array elements 
// 6. Array Rotation 
// 7. String palindrome 
// 8. Anagram checking 
// 9. Array Remove duplicate elements 
// 10.   First non repeating character from a string