
import java.util.*;
public class palindromecheck 
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number to find if palindrome of not");
        int a=sc.nextInt();
        int last=0,rev=0;
        int k=a;
        while(k>0)
        {
            last=k%10;
            k=k/10;
            rev=(rev*10)+last;
            last=0;

        }
        System.out.print(rev);
    

    }
}
