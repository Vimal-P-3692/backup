import java.util.Scanner;
public class pattern {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0; i< n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        rightangle(n);
        sample();
        

    }
    public static void rightangle(int n){
        for (int i=0; i< n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void sample()
    {
        int n=3;
        for(int i=0;i<n;i++)
        {
            for (int j=n-1;j>0;j--){
                System.out.print(" ");

            }
            for(int k=0;k<=i;k++)
            
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
