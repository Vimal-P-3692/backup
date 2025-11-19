public class RECURSIONDIGITS {

    public static void main(String [] args)
    {
        int k=7778;
        System.out.print(CountofDigits(k));
    }
    
    public static int CountofDigits(int n)

    {
        if(n==0)
        {
            return 0;

        }
        return 1+ CountofDigits(n/10);
    }
    
}
