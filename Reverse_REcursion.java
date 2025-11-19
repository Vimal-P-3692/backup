public class Reverse_REcursion {
    
    public static void main(String [] args)
    {
        int k=123,rev =0;
        System.out.println(Reverse_REcursion(k,rev));

    }
    static int Reverse_REcursion(int n, int m)
    
    {
        if(n==0)
        return m;

        

        return Reverse_REcursion(n/10, m*10 + n%10);
    }
}
