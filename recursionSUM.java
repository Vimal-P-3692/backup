public class recursionSUM {

    public static void main(String []args)
    {
        int n=5;
        
        System.out.println(Natsum(n));

        System.out.print(FACT(n));
    }
    static int Natsum(int n)
    {
        if(n==0){
         return 0;}
         return n+ Natsum(n-1);

        


    }
    public static int FACT(int n){
        if(n==0)
        {
            return 1;
        }
        return n* FACT(n-1);
    }
    
}
